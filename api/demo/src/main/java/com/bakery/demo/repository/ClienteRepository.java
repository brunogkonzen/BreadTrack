package com.bakery.demo.repository;

import org.springframework.stereotype.Repository;

import com.bakery.demo.model.Cliente;
import com.bakery.demo.repository.Base.BaseRepository;

@Repository
public interface ClienteRepository extends BaseRepository<Cliente> {
}
