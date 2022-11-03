package com.example.alocv_be.service;


import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface IGerenalService <T>{
    Iterable<T> findAll(Pageable pageable);

    Optional<T> findById(Long id);

    T save(T t);

    void remove(Long id);
}
