package com.newproduct.orderapi.controllers;

import com.newproduct.orderapi.dto.OutletDTO;
import com.newproduct.orderapi.entities.Outlet;
import com.newproduct.orderapi.repositories.OutletRepository;
import com.newproduct.orderapi.services.OutletService;

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
@Api(tags = "Outlets")
@RequestMapping(value = "/outlets", produces = "application/json")
public class OutletController {

    private final OutletService service;

    public OutletController(OutletService service) {
        this.service = service;
    }

    @GetMapping
    @ApiOperation(value = "Returns all outlets in database.")
    @ApiResponse(code = 200, message = "OK.")
    public ResponseEntity<List<OutletDTO>> findAll() {
        return ResponseEntity.ok().body(service.findAll());
    }

    @GetMapping(value = "/{id}")
    @ApiOperation(value = "Returns outlet by ID.")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK."),
            @ApiResponse(code = 404, message = "Outlet not found.")
    })
    public ResponseEntity<OutletDTO> findById(@PathVariable Long id) {
          return ResponseEntity.ok().body(service.findById(id));
    }

    @PostMapping
    @ApiOperation(value = "Create a new outlet in database.")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Outlet created with success."),
            @ApiResponse(code = 400, message = "Problem with request.")
    })
    public void insert (@RequestBody Outlet outlet) {
        service.insert(outlet);
    }

    @DeleteMapping(value = "/{id}")
    @ApiOperation(value = "Delete outlet by ID.")
    @ApiResponses(value = {
            @ApiResponse(code = 204, message = "Deleted with success."),
            @ApiResponse(code = 404, message = "Outlet not found."),
            @ApiResponse(code = 400, message = "Problem with request.")
    })
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}