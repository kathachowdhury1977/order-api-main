package com.newproduct.orderapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.newproduct.orderapi.entities.DeliveryFee;

public interface DeliveryFeeRepository extends JpaRepository<DeliveryFee, Long> {
}
