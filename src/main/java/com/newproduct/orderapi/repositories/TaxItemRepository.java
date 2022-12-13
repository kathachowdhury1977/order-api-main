package com.newproduct.orderapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.newproduct.orderapi.entities.TaxItem;

public interface TaxItemRepository extends JpaRepository<TaxItem, Long> {
}
