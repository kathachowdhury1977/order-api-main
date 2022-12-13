package com.newproduct.orderapi.services;

import com.newproduct.orderapi.dto.TaxDTO;
import com.newproduct.orderapi.entities.Tax;

import java.util.List;


public abstract interface TaxService {

    public List<TaxDTO> findAll();

    public TaxDTO findById(Long id);

    public void insert(Tax tax);

    public void delete(Long id);
}




