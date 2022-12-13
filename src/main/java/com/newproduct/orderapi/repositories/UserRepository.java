package com.newproduct.orderapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.newproduct.orderapi.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
