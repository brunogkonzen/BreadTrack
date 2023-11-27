package com.bakery.demo.repository;
import org.springframework.stereotype.Repository;

import com.bakery.demo.model.Conta;
import com.bakery.demo.repository.Base.BaseRepository;

@Repository
public interface ContaRepository extends BaseRepository<Conta> {
}
