package com.bakery.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bakery.demo.dtos.FluxoVendaPayloadDTO;
import com.bakery.demo.dtos.VendaDTO;
import com.bakery.demo.service.facade.FluxoDeVendaService;

@RestController
@RequestMapping("/api/fluxo-de-venda")
public class FluxoVendaController {
    @Autowired
    private FluxoDeVendaService fvs;

    @PostMapping("")
    public ResponseEntity<VendaDTO> criarFluxoDeVenda(@RequestBody FluxoVendaPayloadDTO payload) {
        VendaDTO response = fvs.comprarProdutos(payload);
        
        return ResponseEntity.ok(response);
    }
}