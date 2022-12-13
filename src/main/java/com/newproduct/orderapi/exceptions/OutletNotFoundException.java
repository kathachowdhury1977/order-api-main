package com.newproduct.orderapi.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class OutletNotFoundException extends RuntimeException{

    public OutletNotFoundException(Long id) {
        super("Outlet not found with ID: " + id);
    }
}
