package com.newproduct.orderapi.services.impl;

import com.newproduct.orderapi.dto.OrderDTO;
import com.newproduct.orderapi.entities.Order;
import com.newproduct.orderapi.exceptions.OrderNotFoundException;
import com.newproduct.orderapi.repositories.OrderRepository;
import com.newproduct.orderapi.services.OrderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderRepository repository;

    @Override
    public List<OrderDTO> findAll() {
        List<Order> list = repository.findAll();
        return list.stream().map(OrderDTO::new).collect(Collectors.toList());
    }

    @Override
    public OrderDTO findById(Long id) {
        return new OrderDTO(repository.findById(id).orElseThrow(() -> new OrderNotFoundException(id)));
    }

    @Override
    public void insert(Order order) {
        repository.save(order);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
