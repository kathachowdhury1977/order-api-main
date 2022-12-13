package com.newproduct.orderapi.services;

import com.newproduct.orderapi.dto.UserProfileDTO;
import com.newproduct.orderapi.entities.UserProfile;

import java.util.List;


public abstract interface UserProfileService {

    public List<UserProfileDTO> findAll();

    public UserProfileDTO findById(Long id);

    public void insert(UserProfile userprofile);

    public void delete(Long id);
}




