package com.newproduct.orderapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.newproduct.orderapi.entities.DeliveryFeeItem;

public interface DeliveryFeeItemRepository extends JpaRepository<DeliveryFeeItem, Long> {
}
