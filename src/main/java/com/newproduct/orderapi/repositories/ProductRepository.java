package com.newproduct.orderapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.newproduct.orderapi.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
