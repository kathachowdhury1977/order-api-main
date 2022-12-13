package com.newproduct.orderapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.newproduct.orderapi.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
