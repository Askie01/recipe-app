package com.askie01.recipeapp.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class RecipeAlreadyExistsException extends RuntimeException {
    public RecipeAlreadyExistsException(String message) {
        super(message);
    }
}
