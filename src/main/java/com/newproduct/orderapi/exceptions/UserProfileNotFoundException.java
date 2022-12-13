package com.newproduct.orderapi.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class UserProfileNotFoundException extends RuntimeException{

    public UserProfileNotFoundException(Long id) {
        super("UserProfile not found with ID: " + id);
    }
}
