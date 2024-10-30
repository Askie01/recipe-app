package com.askie01.recipeapp.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class CategoryAlreadyExistsException extends RuntimeException {
    public CategoryAlreadyExistsException(Long id) {
        super(String.format("Category with id '%d' already exists.", id));
    }

    public CategoryAlreadyExistsException(String name) {
        super(String.format("Category with name '%s' already exists.", name));
    }
}
