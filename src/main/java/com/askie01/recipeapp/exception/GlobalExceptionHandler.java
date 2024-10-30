package com.askie01.recipeapp.exception;

import com.askie01.recipeapp.constant.ResponseCode;
import com.askie01.recipeapp.response.ErrorResponse;
import org.jetbrains.annotations.NotNull;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException exception,
                                                                  @NotNull HttpHeaders headers,
                                                                  @NotNull HttpStatusCode status,
                                                                  @NotNull WebRequest request) {
        final Map<String, String> validationErrors = new HashMap<>();
        final List<ObjectError> validationErrorList = exception.getBindingResult().getAllErrors();

        validationErrorList.forEach(error -> {
            final String validationMessage = error.getDefaultMessage();
            final FieldError fieldError = (FieldError) error;
            final String fieldName = fieldError.getField();
            validationErrors.put(fieldName, validationMessage);
        });
        return new ResponseEntity<>(validationErrors, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorResponse> handleGlobalException(Exception exception,
                                                               WebRequest webRequest) {
        final ErrorResponse errorResponse = ErrorResponse.builder()
                .path(webRequest.getDescription(false))
                .code(ResponseCode.INTERNAL_SERVER_ERROR)
                .message(exception.getMessage())
                .timestamp(LocalDateTime.now())
                .build();
        return new ResponseEntity<>(errorResponse, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ErrorResponse> handleResourceNotFoundException(ResourceNotFoundException exception,
                                                                         WebRequest webRequest) {
        final ErrorResponse errorResponse = ErrorResponse.builder()
                .path(webRequest.getDescription(false))
                .code(ResponseCode.BAD_REQUEST)
                .message(exception.getMessage())
                .timestamp(LocalDateTime.now())
                .build();
        return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(CategoryAlreadyExistsException.class)
    public ResponseEntity<ErrorResponse> handleCategoryAlreadyExistsException(CategoryAlreadyExistsException exception,
                                                                              WebRequest webRequest) {
        final ErrorResponse errorResponse = ErrorResponse.builder()
                .path(webRequest.getDescription(false))
                .code(ResponseCode.BAD_REQUEST)
                .message(exception.getMessage())
                .timestamp(LocalDateTime.now())
                .build();
        return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(DifficultyAlreadyExistsException.class)
    public ResponseEntity<ErrorResponse> handleDifficultyAlreadyExistsException(DifficultyAlreadyExistsException exception,
                                                                                WebRequest webRequest) {
        final ErrorResponse errorResponse = ErrorResponse.builder()
                .path(webRequest.getDescription(false))
                .code(ResponseCode.BAD_REQUEST)
                .message(exception.getMessage())
                .timestamp(LocalDateTime.now())
                .build();
        return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(HashtagAlreadyExistsException.class)
    public ResponseEntity<ErrorResponse> handleHashtagAlreadyExistsException(HashtagAlreadyExistsException exception,
                                                                             WebRequest webRequest) {
        final ErrorResponse errorResponse = ErrorResponse.builder()
                .path(webRequest.getDescription(false))
                .code(ResponseCode.BAD_REQUEST)
                .message(exception.getMessage())
                .timestamp(LocalDateTime.now())
                .build();
        return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(IngredientAlreadyExistsException.class)
    public ResponseEntity<ErrorResponse> handleIngredientAlreadyExistsException(IngredientAlreadyExistsException exception,
                                                                                WebRequest webRequest) {
        final ErrorResponse errorResponse = ErrorResponse.builder()
                .path(webRequest.getDescription(false))
                .code(ResponseCode.BAD_REQUEST)
                .message(exception.getMessage())
                .timestamp(LocalDateTime.now())
                .build();
        return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(RecipeAlreadyExistsException.class)
    public ResponseEntity<ErrorResponse> handleRecipeAlreadyExistsException(RecipeAlreadyExistsException exception,
                                                                            WebRequest webRequest) {
        final ErrorResponse errorResponse = ErrorResponse.builder()
                .path(webRequest.getDescription(false))
                .code(ResponseCode.BAD_REQUEST)
                .message(exception.getMessage())
                .timestamp(LocalDateTime.now())
                .build();
        return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
    }
}
