package com.bakery.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bakery.demo.controller.base.BaseController;
import com.bakery.demo.dtos.VendaDTO;
import com.bakery.demo.model.Venda;
import com.bakery.demo.service.VendaService;
import com.bakery.demo.service.Base.BaseService;

@RestController
@RequestMapping("/api/venda")
public class VendaController extends BaseController<Venda> {
    @Autowired
    VendaService vs;

     public VendaController(BaseService<Venda> service) {
        super(service);
    }

    @GetMapping("/{id}/com-produtos")
    public ResponseEntity<VendaDTO> getVendaWithProducts(@PathVariable Integer id) {
        return ResponseEntity.ok(vs.findWithProducts(id));
    }
}