package com.newproduct.orderapi.services;

import com.newproduct.orderapi.dto.requests.ClientRequestDTO;
import com.newproduct.orderapi.dto.responses.ClientResponseDTO;

import java.util.List;

public abstract interface ClientService {

    public List<ClientResponseDTO> findAll();

    public ClientResponseDTO findById(Long id);

    public ClientResponseDTO insert(ClientRequestDTO dto);

     public void delete(Long id);
}




