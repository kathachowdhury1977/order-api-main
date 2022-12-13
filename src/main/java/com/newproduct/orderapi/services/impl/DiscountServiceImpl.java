package com.newproduct.orderapi.services.impl;

import com.newproduct.orderapi.dto.DiscountDTO;
import com.newproduct.orderapi.entities.Discount;
import com.newproduct.orderapi.exceptions.DiscountNotFoundException;
import com.newproduct.orderapi.repositories.DiscountRepository;
import com.newproduct.orderapi.services.DiscountService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DiscountServiceImpl implements DiscountService {
    @Autowired
    private DiscountRepository repository;

    @Override
    public List<DiscountDTO> findAll() {
        List<Discount> list = repository.findAll();
        return list.stream().map(DiscountDTO::new).collect(Collectors.toList());
    }

    @Override
    public DiscountDTO findById(Long id) {
        return new DiscountDTO(repository.findById(id).orElseThrow(() -> new DiscountNotFoundException(id)));
    }

    @Override
    public void insert(Discount discount) {
        repository.save(discount);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
