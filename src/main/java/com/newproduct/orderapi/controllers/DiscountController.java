package com.newproduct.orderapi.controllers;

import com.newproduct.orderapi.dto.DiscountDTO;
import com.newproduct.orderapi.entities.Discount;
import com.newproduct.orderapi.repositories.DiscountRepository;
import com.newproduct.orderapi.services.DiscountService;

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
@Api(tags = "Discounts")
@RequestMapping(value = "/discounts", produces = "application/json")
public class DiscountController {

    private final DiscountService service;

    public DiscountController(DiscountService service) {
        this.service = service;
    }

    @GetMapping
    @ApiOperation(value = "Returns all discounts in database.")
    @ApiResponse(code = 200, message = "OK.")
    public ResponseEntity<List<DiscountDTO>> findAll() {
        return ResponseEntity.ok().body(service.findAll());
    }

    @GetMapping(value = "/{id}")
    @ApiOperation(value = "Returns Discount by ID.")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK."),
            @ApiResponse(code = 404, message = "discount not found.")
    })
    public ResponseEntity<DiscountDTO> findById(@PathVariable Long id) {
          return ResponseEntity.ok().body(service.findById(id));
    }

    @PostMapping
    @ApiOperation(value = "Create a new discount in database.")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "discount created with success."),
            @ApiResponse(code = 400, message = "problem with request.")
    })
    public void insert (@RequestBody Discount discount) {
        service.insert(discount);
    }

    @DeleteMapping(value = "/{id}")
    @ApiOperation(value = "Delete discount by ID.")
    @ApiResponses(value = {
            @ApiResponse(code = 204, message = "Deleted with success."),
            @ApiResponse(code = 404, message = "Discount not found."),
            @ApiResponse(code = 400, message = "Problem with request.")
    })
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}