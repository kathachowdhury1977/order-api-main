package com.newproduct.orderapi.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class DeliveryFeeNotFoundException extends RuntimeException{

    public DeliveryFeeNotFoundException(Long id) {
        super("DeliveryFee not found with ID: " + id);
    }
}
