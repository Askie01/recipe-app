package com.askie01.recipeapp.controller.operation;

import org.springframework.http.ResponseEntity;

public interface CreateOperation<Response, T> {
    ResponseEntity<Response> create(T object);
}
