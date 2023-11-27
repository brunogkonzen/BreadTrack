package com.bakery.demo.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bakery.demo.controller.base.BaseController;
import com.bakery.demo.model.Padaria;
import com.bakery.demo.service.PadariaService;

@RestController
@RequestMapping("/api/padaria")
public class PadariaController extends BaseController<Padaria> {
    public PadariaController(PadariaService service) {
        super(service);
    }
}