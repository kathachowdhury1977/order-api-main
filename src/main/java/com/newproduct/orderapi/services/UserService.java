package com.newproduct.orderapi.services;

import com.newproduct.orderapi.dto.UserDTO;
import com.newproduct.orderapi.entities.User;

import java.util.List;


public abstract interface UserService {

    public List<UserDTO> findAll();

    public UserDTO findById(Long id);

    public void insert(User user);

    public void delete(Long id);
}




