package com.newproduct.orderapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.newproduct.orderapi.entities.UserProfileItem;

public interface UserProfileItemRepository extends JpaRepository<UserProfileItem, Long> {
}
