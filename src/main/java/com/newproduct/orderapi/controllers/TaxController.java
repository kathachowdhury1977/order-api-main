package com.newproduct.orderapi.controllers;

import com.newproduct.orderapi.dto.TaxDTO;
import com.newproduct.orderapi.entities.Tax;
import com.newproduct.orderapi.repositories.TaxRepository;
import com.newproduct.orderapi.services.TaxService;

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
@Api(tags = "Taxs")
@RequestMapping(value = "/taxs", produces = "application/json")
public class TaxController {

    private final TaxService service;

    public TaxController(TaxService service) {
        this.service = service;
    }

    @GetMapping
    @ApiOperation(value = "Returns all taxs in database.")
    @ApiResponse(code = 200, message = "OK.")
    public ResponseEntity<List<TaxDTO>> findAll() {
        return ResponseEntity.ok().body(service.findAll());
    }

    @GetMapping(value = "/{id}")
    @ApiOperation(value = "Returns tax by ID.")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK."),
            @ApiResponse(code = 404, message = "Tax not found.")
    })
    public ResponseEntity<TaxDTO> findById(@PathVariable Long id) {
          return ResponseEntity.ok().body(service.findById(id));
    }

    @PostMapping
    @ApiOperation(value = "Create a new tax in database.")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Tax created with success."),
            @ApiResponse(code = 400, message = "Problem with request.")
    })
    public void insert (@RequestBody Tax tax) {
        service.insert(tax);
    }

    @DeleteMapping(value = "/{id}")
    @ApiOperation(value = "Delete tax by ID.")
    @ApiResponses(value = {
            @ApiResponse(code = 204, message = "Deleted with success."),
            @ApiResponse(code = 404, message = "Tax not found."),
            @ApiResponse(code = 400, message = "Problem with request.")
    })
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}