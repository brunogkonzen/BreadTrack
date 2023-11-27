package com.bakery.demo.service.Base;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpClientErrorException.NotFound;
import com.bakery.demo.repository.Base.BaseRepository;
import jakarta.transaction.Transactional;

@Component
@Primary
public abstract class BaseService<T> {
    @Autowired
    private BaseRepository<T> repository;

    public Page<T> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    public T findOne(Integer id) {
        return repository.findById(id).orElseThrow(
                () -> NotFound.create(HttpStatusCode.valueOf(404), "Entidade não encontrada!", null, null, null));
    }

    @Transactional
    public T save(T entity) {
        return repository.save(entity);
    }

    @Transactional
    public void delete(Integer id) {
        repository.deleteById(id);
    }
}