package com.newproduct.orderapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.newproduct.orderapi.entities.CouponItem;

public interface CouponItemRepository extends JpaRepository<CouponItem, Long> {
}
