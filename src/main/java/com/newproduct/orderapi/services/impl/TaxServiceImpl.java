package com.newproduct.orderapi.services.impl;

import com.newproduct.orderapi.dto.TaxDTO;
import com.newproduct.orderapi.entities.Tax;
import com.newproduct.orderapi.exceptions.TaxNotFoundException;
import com.newproduct.orderapi.repositories.TaxRepository;
import com.newproduct.orderapi.services.TaxService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TaxServiceImpl implements TaxService {
    @Autowired
    private TaxRepository repository;

    @Override
    public List<TaxDTO> findAll() {
        List<Tax> list = repository.findAll();
        return list.stream().map(TaxDTO::new).collect(Collectors.toList());
    }

    @Override
    public TaxDTO findById(Long id) {
        return new TaxDTO(repository.findById(id).orElseThrow(() -> new TaxNotFoundException(id)));
    }

    @Override
    public void insert(Tax tax) {
        repository.save(tax);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
