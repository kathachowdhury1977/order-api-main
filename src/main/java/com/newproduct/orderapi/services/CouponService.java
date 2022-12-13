package com.newproduct.orderapi.services;

import com.newproduct.orderapi.dto.CouponDTO;
import com.newproduct.orderapi.entities.Coupon;

import java.util.List;


public abstract interface CouponService {

    public List<CouponDTO> findAll();

    public CouponDTO findById(Long id);

    public void insert(Coupon coupon);

    public void delete(Long id);
}




