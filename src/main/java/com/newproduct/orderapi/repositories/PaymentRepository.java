package com.newproduct.orderapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.newproduct.orderapi.entities.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
