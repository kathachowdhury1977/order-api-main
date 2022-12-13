package com.newproduct.orderapi.services;

import com.newproduct.orderapi.dto.AdjustmentDTO;
import com.newproduct.orderapi.entities.Adjustment;

import java.util.List;


public abstract interface AdjustmentService {

    public List<AdjustmentDTO> findAll();

    public AdjustmentDTO findById(Long id);

    public void insert(Adjustment adjustment);

    public void delete(Long id);
}




