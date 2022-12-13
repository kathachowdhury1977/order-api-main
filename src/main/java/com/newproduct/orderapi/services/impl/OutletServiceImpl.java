package com.newproduct.orderapi.services.impl;

import com.newproduct.orderapi.dto.OutletDTO;
import com.newproduct.orderapi.entities.Outlet;
import com.newproduct.orderapi.exceptions.OutletNotFoundException;
import com.newproduct.orderapi.repositories.OutletRepository;
import com.newproduct.orderapi.services.OutletService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OutletServiceImpl implements OutletService {
    @Autowired
    private OutletRepository repository;

    @Override
    public List<OutletDTO> findAll() {
        List<Outlet> list = repository.findAll();
        return list.stream().map(OutletDTO::new).collect(Collectors.toList());
    }

    @Override
    public OutletDTO findById(Long id) {
        return new OutletDTO(repository.findById(id).orElseThrow(() -> new OutletNotFoundException(id)));
    }

    @Override
    public void insert(Outlet outlet) {
        repository.save(outlet);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
