package com.julio.app.poointerfaces.repository;

import com.julio.app.poointerfaces.models.Client;

import java.util.List;

public interface CrudRepository <T> {

    List<T> list();
    T getById(Integer id);
    void create(T client);
    void update(T client);
    void delete (Integer id);
}
