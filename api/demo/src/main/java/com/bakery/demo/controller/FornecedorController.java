package com.bakery.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bakery.demo.controller.base.BaseController;
import com.bakery.demo.model.Fornecedor;
import com.bakery.demo.service.Base.BaseService;

@RestController
@RequestMapping("/api/fornecedor")
public class FornecedorController extends BaseController<Fornecedor> {
     public FornecedorController(BaseService<Fornecedor> service) {
        super(service);
    }
}