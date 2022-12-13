package com.newproduct.orderapi.services;

import com.newproduct.orderapi.dto.DeliveryFeeDTO;
import com.newproduct.orderapi.entities.DeliveryFee;

import java.util.List;


public abstract interface DeliveryFeeService {

    public List<DeliveryFeeDTO> findAll();

    public DeliveryFeeDTO findById(Long id);

    public void insert(DeliveryFee deliveryfee);

    public void delete(Long id);
}




