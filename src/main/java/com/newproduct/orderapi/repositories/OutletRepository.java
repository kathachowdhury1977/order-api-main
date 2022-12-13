package com.newproduct.orderapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.newproduct.orderapi.entities.Outlet;

public interface OutletRepository extends JpaRepository<Outlet, Long> {
}
