package com.newproduct.orderapi.services;

import com.newproduct.orderapi.dto.DiscountDTO;
import com.newproduct.orderapi.entities.Discount;

import java.util.List;


public abstract interface DiscountService {

    public List<DiscountDTO> findAll();

    public DiscountDTO findById(Long id);

    public void insert(Discount discount);

    public void delete(Long id);
}




