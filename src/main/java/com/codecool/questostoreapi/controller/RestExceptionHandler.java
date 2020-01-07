package com.codecool.questostoreapi.controller;

import com.codecool.questostoreapi.errors.ApiError;
import com.codecool.questostoreapi.errors.EntityNotFoundException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import org.springframework.http.ResponseEntity;
import static org.springframework.http.HttpStatus.NOT_FOUND;


@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {


    @ExceptionHandler(EntityNotFoundException.class)
    protected ResponseEntity<Object> handleEntityNotFound(
            EntityNotFoundException ex) {
        ApiError apiError = new ApiError(NOT_FOUND);
        apiError.setMessage(ex.getMessage());
        return buildResponseEntity(apiError);
    }

    protected ResponseEntity<Object> handleResourceNotFound

    @ExceptionHandler(ResourceNotFoundException.class)
    private ResponseEntity<Void> handleResourceNotFoundException(ResourceNotFoundException ex) {
        ApiError apiError = new ApiError(NOT_FOUND);
        apiError.setMessage(ex.getMessage());
        return buildResponseEntity(apiError);
    }
}
