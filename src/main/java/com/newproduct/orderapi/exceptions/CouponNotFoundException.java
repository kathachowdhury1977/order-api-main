package com.newproduct.orderapi.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class CouponNotFoundException extends RuntimeException{

    public CouponNotFoundException(Long id) {
        super("Coupon not found with ID: " + id);
    }
}
