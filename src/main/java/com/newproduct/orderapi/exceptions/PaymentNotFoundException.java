package com.newproduct.orderapi.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class PaymentNotFoundException extends RuntimeException{

    public PaymentNotFoundException(Long id) {
        super("Payment not found with ID: " + id);
    }
}
