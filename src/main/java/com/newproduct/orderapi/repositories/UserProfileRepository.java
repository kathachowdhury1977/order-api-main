package com.newproduct.orderapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.newproduct.orderapi.entities.UserProfile;

public interface UserProfileRepository extends JpaRepository<UserProfile, Long> {
}
