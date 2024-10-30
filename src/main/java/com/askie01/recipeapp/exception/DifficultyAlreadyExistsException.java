package com.askie01.recipeapp.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class DifficultyAlreadyExistsException extends RuntimeException {
    public DifficultyAlreadyExistsException(Long id) {
        super(String.format("Difficulty with id '%d' already exists.", id));
    }

    public DifficultyAlreadyExistsException(String name) {
        super(String.format("Difficulty with name '%s' already exists.", name));
    }
}
