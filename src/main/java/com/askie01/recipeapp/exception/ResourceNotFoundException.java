package com.askie01.recipeapp.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(String resourceName, String fieldName, Long fieldValue) {
        super(String.format("'%s' was not found by '%s' with value '%s'.", resourceName, fieldName, fieldValue));
    }

    public ResourceNotFoundException(String resourceName, String fieldName, Integer fieldValue) {
        super(String.format("'%s' was not found by '%s' with value '%s'.", resourceName, fieldName, fieldValue));
    }

    public ResourceNotFoundException(String resourceName, String fieldName, String fieldValue) {
        super(String.format("'%s' was not found by '%s' with value '%s'.", resourceName, fieldName, fieldValue));
    }
}
