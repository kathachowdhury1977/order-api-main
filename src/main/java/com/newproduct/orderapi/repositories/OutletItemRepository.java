package com.newproduct.orderapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.newproduct.orderapi.entities.OutletItem;

public interface OutletItemRepository extends JpaRepository<OutletItem, Long> {
}
