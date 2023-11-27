package com.bakery.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bakery.demo.model.Cliente;
import com.bakery.demo.model.Encomenda;
import com.bakery.demo.model.Produto;
import com.bakery.demo.service.Base.BaseService;

@Service
public class EncomendaService extends BaseService<Encomenda> {

    @Autowired
    ProdutoService ps;
    @Autowired
    ClienteService cs;

    @Override
    public Encomenda save(Encomenda entity) {
        Produto produto = ps.findOne(entity.getProduto().getCodpro());
        Cliente cliente = cs.findOne(entity.getCliente().getCodcli());


        entity.setCpfcli(cliente.getCpfcli());
        entity.setProduto(produto);
        entity.setCliente(cliente);

        return super.save(entity);
    }
}
