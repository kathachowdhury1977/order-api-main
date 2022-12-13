package com.newproduct.orderapi.services.impl;

import com.newproduct.orderapi.dto.PaymentDTO;
import com.newproduct.orderapi.entities.Payment;
import com.newproduct.orderapi.exceptions.PaymentNotFoundException;
import com.newproduct.orderapi.repositories.PaymentRepository;
import com.newproduct.orderapi.services.PaymentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    private PaymentRepository repository;

    @Override
    public List<PaymentDTO> findAll() {
        List<Payment> list = repository.findAll();
        return list.stream().map(PaymentDTO::new).collect(Collectors.toList());
    }

    @Override
    public PaymentDTO findById(Long id) {
        return new PaymentDTO(repository.findById(id).orElseThrow(() -> new PaymentNotFoundException(id)));
    }

    @Override
    public void insert(Payment payment) {
        repository.save(payment);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
