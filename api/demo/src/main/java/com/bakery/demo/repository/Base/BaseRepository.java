package com.bakery.demo.repository.Base;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.jpa.repository.JpaRepository;

@NoRepositoryBean
public interface BaseRepository<T> extends JpaRepository<T, Integer> {
}
