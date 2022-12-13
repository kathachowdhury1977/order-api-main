package com.newproduct.orderapi.controllers;

import com.newproduct.orderapi.dto.AdjustmentDTO;
import com.newproduct.orderapi.entities.Adjustment;
import com.newproduct.orderapi.repositories.AdjustmentRepository;
import com.newproduct.orderapi.services.AdjustmentService;

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
@Api(tags = "Adjustments")
@RequestMapping(value = "/adjustments", produces = "application/json")
public class AdjustmentController {

    private final AdjustmentService service;

    public AdjustmentController(AdjustmentService service) {
        this.service = service;
    }

    @GetMapping
    @ApiOperation(value = "Returns all adjustments in database.")
    @ApiResponse(code = 200, message = "OK.")
    public ResponseEntity<List<AdjustmentDTO>> findAll() {
        return ResponseEntity.ok().body(service.findAll());
    }

    @GetMapping(value = "/{id}")
    @ApiOperation(value = "Returns adjustment by ID.")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK."),
            @ApiResponse(code = 404, message = "Adjustment not found.")
    })
    public ResponseEntity<AdjustmentDTO> findById(@PathVariable Long id) {
          return ResponseEntity.ok().body(service.findById(id));
    }

    @PostMapping
    @ApiOperation(value = "Create a new adjustment in database.")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Adjustment created with success."),
            @ApiResponse(code = 400, message = "Problem with request.")
    })
    public void insert (@RequestBody Adjustment adjustment) {
        service.insert(adjustment);
    }

    @DeleteMapping(value = "/{id}")
    @ApiOperation(value = "Delete adjustment by ID.")
    @ApiResponses(value = {
            @ApiResponse(code = 204, message = "Deleted with success."),
            @ApiResponse(code = 404, message = "Adjustment not found."),
            @ApiResponse(code = 400, message = "Problem with request.")
    })
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}