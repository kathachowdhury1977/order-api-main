package com.newproduct.orderapi.services;

import com.newproduct.orderapi.dto.PaymentDTO;
import com.newproduct.orderapi.entities.Payment;

import java.util.List;


public abstract interface PaymentService {

    public List<PaymentDTO> findAll();

    public PaymentDTO findById(Long id);

    public void insert(Payment payment);

    public void delete(Long id);
}




