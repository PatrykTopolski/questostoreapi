package com.codecool.questostoreapi.errors;

import org.springframework.context.annotation.Bean;

public class EntityNotFoundException extends Exception {

    EntityNotFoundException(String message){
        super(message);
    }
}
