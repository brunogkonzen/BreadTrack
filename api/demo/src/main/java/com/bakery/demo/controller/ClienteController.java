package com.bakery.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bakery.demo.controller.base.BaseController;
import com.bakery.demo.model.Cliente;
import com.bakery.demo.service.ClienteService;

@RestController
@RequestMapping("/api/cliente")
public class ClienteController extends BaseController<Cliente> {
    public ClienteController(ClienteService service) {
        super(service);
    }
}