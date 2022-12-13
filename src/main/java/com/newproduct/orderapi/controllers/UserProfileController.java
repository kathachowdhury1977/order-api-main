package com.newproduct.orderapi.controllers;

import com.newproduct.orderapi.dto.UserProfileDTO;
import com.newproduct.orderapi.entities.UserProfile;
import com.newproduct.orderapi.repositories.UserProfileRepository;
import com.newproduct.orderapi.services.UserProfileService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@Api(tags = "UserProfiles")
@RequestMapping(value = "/userprofiles", produces = "application/json")
public class UserProfileController {

    private final UserProfileService service;

    public UserProfileController(UserProfileService service) {
        this.service = service;
    }

    @GetMapping
    @ApiOperation(value = "Returns all userprofiles in database.")
    @ApiResponse(code = 200, message = "OK.")
    public ResponseEntity<List<UserProfileDTO>> findAll() {
        return ResponseEntity.ok().body(service.findAll());
    }

    @GetMapping(value = "/{id}")
    @ApiOperation(value = "Returns userprofile by ID.")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK."),
            @ApiResponse(code = 404, message = "UserProfile not found.")
    })
    public ResponseEntity<UserProfileDTO> findById(@PathVariable Long id) {
          return ResponseEntity.ok().body(service.findById(id));
    }

    @PostMapping
    @ApiOperation(value = "Create a new userprofile in database.")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "UserProfile created with success."),
            @ApiResponse(code = 400, message = "Problem with request.")
    })
    public void insert (@RequestBody UserProfile userprofile) {
        service.insert(userprofile);
    }

    @DeleteMapping(value = "/{id}")
    @ApiOperation(value = "Delete userprofile by ID.")
    @ApiResponses(value = {
            @ApiResponse(code = 204, message = "Deleted with success."),
            @ApiResponse(code = 404, message = "UserProfile not found."),
            @ApiResponse(code = 400, message = "Problem with request.")
    })
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}