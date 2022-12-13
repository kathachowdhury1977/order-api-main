package com.newproduct.orderapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.newproduct.orderapi.entities.AdjustmentItem;

public interface AdjustmentItemRepository extends JpaRepository<AdjustmentItem, Long> {
}
