package com.bakery.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bakery.demo.model.Produtovenda;
import com.bakery.demo.repository.ProdutovendaRepository;
import com.bakery.demo.service.Base.BaseService;

@Service
public class ProdutoVendaService extends BaseService<Produtovenda> {
    @Autowired
    ProdutoService ps;

    @Autowired
    VendaService vs;

    @Autowired 
    ProdutovendaRepository pr;

    @Override
    public Produtovenda save(Produtovenda entity) {
        entity.setProduto(ps.findOne(entity.getProduto().getCodcli()));
        entity.setVenda(vs.findOne(entity.getVenda().getCodven()));

        return super.save(entity);
    }
}
