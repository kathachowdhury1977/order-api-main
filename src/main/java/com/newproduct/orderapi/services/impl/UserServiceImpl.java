package com.newproduct.orderapi.services.impl;

import com.newproduct.orderapi.dto.UserDTO;
import com.newproduct.orderapi.entities.User;
import com.newproduct.orderapi.exceptions.UserNotFoundException;
import com.newproduct.orderapi.repositories.UserRepository;
import com.newproduct.orderapi.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository repository;

    @Override
    public List<UserDTO> findAll() {
        List<User> list = repository.findAll();
        return list.stream().map(UserDTO::new).collect(Collectors.toList());
    }

    @Override
    public UserDTO findById(Long id) {
        return new UserDTO(repository.findById(id).orElseThrow(() -> new UserNotFoundException(id)));
    }

    @Override
    public void insert(User user) {
        repository.save(user);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
