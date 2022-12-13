package com.newproduct.orderapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.newproduct.orderapi.entities.DiscountItem;

public interface DiscountItemRepository extends JpaRepository<DiscountItem, Long> {
}
