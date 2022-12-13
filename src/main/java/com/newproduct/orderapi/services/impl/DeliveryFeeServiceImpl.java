package com.newproduct.orderapi.services.impl;

import com.newproduct.orderapi.dto.DeliveryFeeDTO;
import com.newproduct.orderapi.entities.DeliveryFee;
import com.newproduct.orderapi.exceptions.DeliveryFeeNotFoundException;
import com.newproduct.orderapi.exceptions.DeliveryFeeNotFoundException;
import com.newproduct.orderapi.repositories.DeliveryFeeRepository;
import com.newproduct.orderapi.services.DeliveryFeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DeliveryFeeServiceImpl implements DeliveryFeeService {
    @Autowired
    private DeliveryFeeRepository repository;

    @Override
    public List<DeliveryFeeDTO> findAll() {
        List<DeliveryFee> list = repository.findAll();
        return list.stream().map(DeliveryFeeDTO::new).collect(Collectors.toList());
    }

    @Override
    public DeliveryFeeDTO findById(Long id) {
        return new DeliveryFeeDTO(repository.findById(id).orElseThrow(() -> new DeliveryFeeNotFoundException(id)));
    }

    @Override
    public void insert(DeliveryFee deliveryfee) {
        repository.save(deliveryfee);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
