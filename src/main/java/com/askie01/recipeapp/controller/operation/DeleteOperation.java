package com.askie01.recipeapp.controller.operation;

import org.springframework.http.ResponseEntity;

public interface DeleteOperation<Response, T> {
    ResponseEntity<Response> delete(T object);
}
