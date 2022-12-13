package com.newproduct.orderapi.services.impl;

import com.newproduct.orderapi.dto.AdjustmentDTO;
import com.newproduct.orderapi.entities.Adjustment;
import com.newproduct.orderapi.exceptions.AdjustmentNotFoundException;
import com.newproduct.orderapi.repositories.AdjustmentRepository;
import com.newproduct.orderapi.services.AdjustmentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AdjustmentServiceImpl implements AdjustmentService {
    @Autowired
    private AdjustmentRepository repository;

    @Override
    public List<AdjustmentDTO> findAll() {
        List<Adjustment> list = repository.findAll();
        return list.stream().map(AdjustmentDTO::new).collect(Collectors.toList());
    }

    @Override
    public AdjustmentDTO findById(Long id) {
        return new AdjustmentDTO(repository.findById(id).orElseThrow(() -> new AdjustmentNotFoundException(id)));
    }

    @Override
    public void insert(Adjustment adjustment) {
        repository.save(adjustment);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
