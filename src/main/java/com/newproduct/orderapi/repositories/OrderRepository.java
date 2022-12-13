package com.newproduct.orderapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.newproduct.orderapi.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
