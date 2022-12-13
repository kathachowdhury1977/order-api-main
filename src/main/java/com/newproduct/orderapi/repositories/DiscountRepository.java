package com.newproduct.orderapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.newproduct.orderapi.entities.Discount;

public interface DiscountRepository extends JpaRepository<Discount, Long> {
}
