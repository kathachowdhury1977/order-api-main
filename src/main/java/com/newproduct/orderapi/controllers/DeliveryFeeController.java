package com.newproduct.orderapi.controllers;

import com.newproduct.orderapi.dto.DeliveryFeeDTO;
import com.newproduct.orderapi.entities.DeliveryFee;
import com.newproduct.orderapi.repositories.DeliveryFeeRepository;
import com.newproduct.orderapi.services.DeliveryFeeService;

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
@Api(tags = "DeliveryFees")
@RequestMapping(value = "/deliveryfees", produces = "application/json")
public class DeliveryFeeController {

    private final DeliveryFeeService service;

    public DeliveryFeeController(DeliveryFeeService service) {
        this.service = service;
    }

    @GetMapping
    @ApiOperation(value = "Returns all deliveryfees in database.")
    @ApiResponse(code = 200, message = "OK.")
    public ResponseEntity<List<DeliveryFeeDTO>> findAll() {
        return ResponseEntity.ok().body(service.findAll());
    }

    @GetMapping(value = "/{id}")
    @ApiOperation(value = "Returns deliveryfee by ID.")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK."),
            @ApiResponse(code = 404, message = "DeliveryFee not found.")
    })
    public ResponseEntity<DeliveryFeeDTO> findById(@PathVariable Long id) {
          return ResponseEntity.ok().body(service.findById(id));
    }

    @PostMapping
    @ApiOperation(value = "Create a new deliveryfee in database.")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "DeliveryFee created with success."),
            @ApiResponse(code = 400, message = "Problem with request.")
    })
    public void insert (@RequestBody DeliveryFee deliveryfee) {
        service.insert(deliveryfee);
    }

    @DeleteMapping(value = "/{id}")
    @ApiOperation(value = "Delete deliveryfee by ID.")
    @ApiResponses(value = {
            @ApiResponse(code = 204, message = "Deleted with success."),
            @ApiResponse(code = 404, message = "DeliveryFee not found."),
            @ApiResponse(code = 400, message = "Problem with request.")
    })
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}