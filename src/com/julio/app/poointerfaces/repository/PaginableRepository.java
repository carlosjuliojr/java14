package com.julio.app.poointerfaces.repository;

import com.julio.app.poointerfaces.models.Client;

import java.util.List;

public interface PaginableRepository<T> {
    List<T> list(int start, int end);
}
