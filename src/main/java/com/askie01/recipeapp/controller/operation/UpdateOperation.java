package com.askie01.recipeapp.controller.operation;

import org.springframework.http.ResponseEntity;

public interface UpdateOperation<Response, T> {
    ResponseEntity<Response> update(T object);
}
