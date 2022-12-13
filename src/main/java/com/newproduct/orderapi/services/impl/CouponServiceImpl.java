package com.newproduct.orderapi.services.impl;

import com.newproduct.orderapi.dto.CouponDTO;
import com.newproduct.orderapi.entities.Coupon;
import com.newproduct.orderapi.exceptions.CouponNotFoundException;
import com.newproduct.orderapi.repositories.CouponRepository;
import com.newproduct.orderapi.services.CouponService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CouponServiceImpl implements CouponService {
    @Autowired
    private CouponRepository repository;

    @Override
    public List<CouponDTO> findAll() {
        List<Coupon> list = repository.findAll();
        return list.stream().map(CouponDTO::new).collect(Collectors.toList());
    }

    @Override
    public CouponDTO findById(Long id) {
        return new CouponDTO(repository.findById(id).orElseThrow(() -> new CouponNotFoundException(id)));
    }

    @Override
    public void insert(Coupon coupon) {
        repository.save(coupon);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
