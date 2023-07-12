package com.julio.app.poointerfaces.repository;

import com.julio.app.poointerfaces.models.Client;

import java.util.List;

public interface OrderedRepository <T> {

    List<T> list(String campo, Direction dir);
}
