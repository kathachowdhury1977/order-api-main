package com.newproduct.orderapi.controllers;

import com.newproduct.orderapi.dto.CouponDTO;
import com.newproduct.orderapi.entities.Coupon;
import com.newproduct.orderapi.repositories.CouponRepository;
import com.newproduct.orderapi.services.CouponService;

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
@Api(tags = "Coupons")
@RequestMapping(value = "/coupons", produces = "application/json")
public class CouponController {

    private final CouponService service;

    public CouponController(CouponService service) {
        this.service = service;
    }

    @GetMapping
    @ApiOperation(value = "Returns all coupons in database.")
    @ApiResponse(code = 200, message = "OK.")
    public ResponseEntity<List<CouponDTO>> findAll() {
        return ResponseEntity.ok().body(service.findAll());
    }

    @GetMapping(value = "/{id}")
    @ApiOperation(value = "Returns coupon by ID.")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK."),
            @ApiResponse(code = 404, message = "Coupon not found.")
    })
    public ResponseEntity<CouponDTO> findById(@PathVariable Long id) {
          return ResponseEntity.ok().body(service.findById(id));
    }

    @PostMapping
    @ApiOperation(value = "Create a new coupon in database.")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Coupon created with success."),
            @ApiResponse(code = 400, message = "Problem with request.")
    })
    public void insert (@RequestBody Coupon coupon) {
        service.insert(coupon);
    }

    @DeleteMapping(value = "/{id}")
    @ApiOperation(value = "Delete coupon by ID.")
    @ApiResponses(value = {
            @ApiResponse(code = 204, message = "Deleted with success."),
            @ApiResponse(code = 404, message = "Coupon not found."),
            @ApiResponse(code = 400, message = "Problem with request.")
    })
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}