package com.bakery.demo.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.bakery.demo.controller.base.BaseController;
import com.bakery.demo.model.Encomenda;
import com.bakery.demo.service.EncomendaService;

@RestController
@RequestMapping("/api/encomenda")
public class EncomendaController extends BaseController<Encomenda> {
    public EncomendaController(EncomendaService service) {
        super(service);
    }
}