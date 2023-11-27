package com.bakery.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bakery.demo.dtos.ProductDTO;
import com.bakery.demo.dtos.VendaDTO;
import com.bakery.demo.model.Cliente;
import com.bakery.demo.model.Padaria;
import com.bakery.demo.model.Venda;
import com.bakery.demo.repository.VendaRepository;
import com.bakery.demo.service.Base.BaseService;


@Service
public class VendaService extends BaseService<Venda>{
    @Autowired
    ClienteService cs;

    @Autowired
    PadariaService ps;

    @Autowired
    VendaRepository vr;
    
    @Override
    public Venda save(Venda entity) {
        Cliente cliente = cs.findOne(entity.getCliente().getCodcli());
        Padaria padaria = ps.findOne(entity.getPadaria().getCnpj());

        entity.setCliente(cliente);
        entity.setPadaria(padaria);
        entity.setCpfcli(cliente.getCpfcli());
        
        return super.save(entity);
    }

    public VendaDTO findWithProducts(Integer sellId) {
        Venda venda = super.findOne(sellId);
        List<ProductDTO> produtos = this.findBySell(sellId); 
        
        VendaDTO dto = new VendaDTO();

        dto.setCpfCliente(venda.getCpfcli());
        dto.setDataVenda(venda.getDatven());
        dto.setNomeCliente(venda.getCliente().getNomcli());
        dto.setNomePadaria(venda.getPadaria().getNomfanpad());
        dto.setValorVenda(venda.getVlrven());
        dto.setProdutos(produtos);

        return dto;
    }

    public List<ProductDTO> findBySell(Integer sellId) {
        return vr.findSellWithProducts(sellId);
    }
}
