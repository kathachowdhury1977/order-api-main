package com.newproduct.orderapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.newproduct.orderapi.entities.Adjustment;

public interface AdjustmentRepository extends JpaRepository<Adjustment, Long> {
}
