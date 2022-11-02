package com.example.alocv_be.service;


import java.util.Optional;

public interface IGerenalService <T>{
    Iterable<T> findAll();

    Optional<T> findById(Long id);

    T save(T t);

    void remove(Long id);
}
