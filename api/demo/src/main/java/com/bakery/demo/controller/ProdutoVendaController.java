package com.bakery.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bakery.demo.controller.base.BaseController;
import com.bakery.demo.model.Produtovenda;
import com.bakery.demo.service.ProdutoVendaService;

@RestController
@RequestMapping("/api/produto-venda")
public class ProdutoVendaController extends BaseController<Produtovenda> {
    public ProdutoVendaController(ProdutoVendaService service) {
        super(service);
    }
}