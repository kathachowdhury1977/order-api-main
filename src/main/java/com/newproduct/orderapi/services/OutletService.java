package com.newproduct.orderapi.services;

import com.newproduct.orderapi.dto.OutletDTO;
import com.newproduct.orderapi.entities.Outlet;

import java.util.List;


public abstract interface OutletService {

    public List<OutletDTO> findAll();

    public OutletDTO findById(Long id);

    public void insert(Outlet outlet);

    public void delete(Long id);
}




