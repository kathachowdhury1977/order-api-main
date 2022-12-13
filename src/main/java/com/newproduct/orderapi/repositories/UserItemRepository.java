package com.newproduct.orderapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.newproduct.orderapi.entities.UserItem;

public interface UserItemRepository extends JpaRepository<UserItem, Long> {
}
