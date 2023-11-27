package com.bakery.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bakery.demo.controller.base.BaseController;
import com.bakery.demo.model.Conta;
import com.bakery.demo.service.Base.BaseService;

@RestController
@RequestMapping("/api/conta")
public class ContaController extends BaseController<Conta> {
     public ContaController(BaseService<Conta> service) {
        super(service);
    }
}