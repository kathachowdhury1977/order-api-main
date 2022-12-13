package com.newproduct.orderapi.services.impl;

import com.newproduct.orderapi.dto.UserProfileDTO;
import com.newproduct.orderapi.entities.UserProfile;
import com.newproduct.orderapi.exceptions.UserProfileNotFoundException;
import com.newproduct.orderapi.repositories.UserProfileRepository;
import com.newproduct.orderapi.services.UserProfileService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserProfileServiceImpl implements UserProfileService {
    @Autowired
    private UserProfileRepository repository;

    @Override
    public List<UserProfileDTO> findAll() {
        List<UserProfile> list = repository.findAll();
        return list.stream().map(UserProfileDTO::new).collect(Collectors.toList());
    }

    @Override
    public UserProfileDTO findById(Long id) {
        return new UserProfileDTO(repository.findById(id).orElseThrow(() -> new UserProfileNotFoundException(id)));
    }

    @Override
    public void insert(UserProfile userprofile) {
        repository.save(userprofile);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
