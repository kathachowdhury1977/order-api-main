package com.newproduct.orderapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.newproduct.orderapi.entities.Tax;

public interface TaxRepository extends JpaRepository<Tax, Long> {
}
