package com.newproduct.orderapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.newproduct.orderapi.entities.Coupon;

public interface CouponRepository extends JpaRepository<Coupon, Long> {
}
