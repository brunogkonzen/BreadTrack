package com.bakery.demo.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException.NotFound;

import com.bakery.demo.model.Cliente;
import com.bakery.demo.model.Conta;
import com.bakery.demo.repository.ClienteRepository;
import com.bakery.demo.service.Base.BaseService;

@Service
public class ContaService extends BaseService<Conta> {

    @Autowired
    ClienteRepository pr;

    @Override
    public Conta save(Conta entity) {
        Integer codCliente = entity.getCliente().getCodcli();
        Cliente cliente = pr.findById(codCliente).orElseThrow(() -> NotFound.create(HttpStatusCode.valueOf(404), "Cliente não localizado na base!", null, null, null));
        entity.setCliente(cliente);
        entity.setCpfcli(cliente.getCpfcli());

        return super.save(entity);
    }
}
