package com.newproduct.orderapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.newproduct.orderapi.entities.PaymentItem;

public interface PaymentItemRepository extends JpaRepository<PaymentItem, Long> {
}
