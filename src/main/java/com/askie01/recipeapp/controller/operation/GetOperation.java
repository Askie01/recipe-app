package com.askie01.recipeapp.controller.operation;

import org.springframework.http.ResponseEntity;

public interface GetOperation<T> {
    ResponseEntity<T> get(T object);
}
