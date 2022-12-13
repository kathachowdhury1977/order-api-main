package com.newproduct.orderapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.newproduct.orderapi.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
