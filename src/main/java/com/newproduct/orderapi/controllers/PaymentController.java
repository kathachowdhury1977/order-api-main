package com.newproduct.orderapi.controllers;

import com.newproduct.orderapi.dto.PaymentDTO;
import com.newproduct.orderapi.entities.Payment;
import com.newproduct.orderapi.repositories.PaymentRepository;
import com.newproduct.orderapi.services.PaymentService;

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
@Api(tags = "Payments")
@RequestMapping(value = "/payments", produces = "application/json")
public class PaymentController {

    private final PaymentService service;

    public PaymentController(PaymentService service) {
        this.service = service;
    }

    @GetMapping
    @ApiOperation(value = "Returns all payments in database.")
    @ApiResponse(code = 200, message = "OK.")
    public ResponseEntity<List<PaymentDTO>> findAll() {
        return ResponseEntity.ok().body(service.findAll());
    }

    @GetMapping(value = "/{id}")
    @ApiOperation(value = "Returns Payment by ID.")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK."),
            @ApiResponse(code = 404, message = "payment not found.")
    })
    public ResponseEntity<PaymentDTO> findById(@PathVariable Long id) {
          return ResponseEntity.ok().body(service.findById(id));
    }

    @PostMapping
    @ApiOperation(value = "Create a new payment in database.")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "payment created with success."),
            @ApiResponse(code = 400, message = "problem with request.")
    })
    public void insert (@RequestBody Payment payment) {
        service.insert(payment);
    }

    @DeleteMapping(value = "/{id}")
    @ApiOperation(value = "Delete payment by ID.")
    @ApiResponses(value = {
            @ApiResponse(code = 204, message = "Deleted with success."),
            @ApiResponse(code = 404, message = "Payment not found."),
            @ApiResponse(code = 400, message = "Problem with request.")
    })
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}