package com.bakery.demo.service.facade;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bakery.demo.dtos.FluxoVendaPayloadDTO;
import com.bakery.demo.dtos.ProdutoFluxoVendaDTO;
import com.bakery.demo.dtos.VendaDTO;
import com.bakery.demo.model.Cliente;
import com.bakery.demo.model.Produto;
import com.bakery.demo.model.Produtovenda;
import com.bakery.demo.model.ProdutovendaKey;
import com.bakery.demo.model.Venda;
import com.bakery.demo.service.ClienteService;
import com.bakery.demo.service.PadariaService;
import com.bakery.demo.service.ProdutoService;
import com.bakery.demo.service.ProdutoVendaService;
import com.bakery.demo.service.VendaService;

import jakarta.transaction.Transactional;

@Service
public class FluxoDeVendaService {

    @Autowired
    VendaService vs;

    @Autowired 
    ProdutoService ps;

    @Autowired
    ClienteService cs;

    @Autowired 
    ProdutoVendaService pvs;

    @Autowired 
    PadariaService padariaS; 


    @Transactional
    public VendaDTO comprarProdutos(FluxoVendaPayloadDTO controllerPayload) {
        Cliente cliente = cs.findOne(controllerPayload.getClienteId());
        Set<Produto> produtoList = new HashSet<Produto>();

        for (ProdutoFluxoVendaDTO produto : controllerPayload.getProdutos()) {
            Produto databaseProduct = ps.findOne(produto.getIdProduto());

            if (databaseProduct.getQtdest() - produto.getQtdProduto() < 0) {
                throw new Error("Produto sem estoque: " + databaseProduct.getNompro() + ". Quantidade em estoque: " + databaseProduct.getQtdest());
            }

            databaseProduct.setQtdest(databaseProduct.getQtdest() - produto.getQtdProduto());
            ps.save(databaseProduct);
            
            produtoList.add(databaseProduct);
        }


        Venda newVenda = new Venda();
        newVenda.setCliente(cliente);
        newVenda.setDatven(LocalDate.now());
        newVenda.setQtdven(produtoList.size());
        newVenda.setVlrven(BigDecimal.valueOf(produtoList.stream().collect(Collectors.summingDouble(pd -> pd.getVlrpro().doubleValue())).doubleValue()));
        newVenda.setQtdven(controllerPayload.getProdutos().stream().collect(Collectors.summingInt(pd -> pd.getQtdProduto())));
        newVenda.setPadaria(padariaS.findOne(controllerPayload.getCnpjPadaria()));

        Venda venda = vs.save(newVenda);


        for (Produto produto : produtoList) {
            Produtovenda pv = new Produtovenda();
            ProdutovendaKey pvk = new ProdutovendaKey();

            pvk.setCodpro(produto.getCodpro());
            pvk.setCodven(venda.getCodven());
            
            pv.setId(pvk);
            pv.setProduto(produto);
            pv.setVenda(venda); 
            
            
            pvs.save(pv);
        }

        return vs.findWithProducts(venda.getCodven());
    }
}
