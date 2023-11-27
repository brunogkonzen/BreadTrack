package com.bakery.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bakery.demo.controller.base.BaseController;
import com.bakery.demo.model.Setor;
import com.bakery.demo.service.Base.BaseService;

@RestController
@RequestMapping("/api/setor")
public class SetorController extends BaseController<Setor> {
     public SetorController(BaseService<Setor> service) {
        super(service);
    }
}