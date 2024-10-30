package com.askie01.recipeapp.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class IngredientAlreadyExistsException extends RuntimeException {
    public IngredientAlreadyExistsException(Long id) {
        super(String.format("Ingredient with id '%d' already exists.", id));
    }

    public IngredientAlreadyExistsException(String name) {
        super(String.format("Ingredient with name '%s' already exists.", name));
    }
}
