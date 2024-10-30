package com.askie01.recipeapp.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class HashtagAlreadyExistsException extends RuntimeException {
    public HashtagAlreadyExistsException(Long id) {
        super(String.format("Hashtag with id '%d' already exists.", id));
    }

    public HashtagAlreadyExistsException(String name) {
        super(String.format("Hashtag with name '%s' already exists.", name));
    }
}
