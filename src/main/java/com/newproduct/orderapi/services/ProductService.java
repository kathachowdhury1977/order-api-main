package com.newproduct.orderapi.services;


import java.util.List;

import com.newproduct.orderapi.dto.ProductDTO;

public abstract interface ProductService {
     public List<ProductDTO> findAll();

    public ProductDTO findById(Long id);
    
    public void insert(ProductDTO dto);

    public void delete(Long id);
}

