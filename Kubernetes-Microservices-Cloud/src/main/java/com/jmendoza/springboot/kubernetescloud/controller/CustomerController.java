package com.jmendoza.springboot.kubernetescloud.controller;


import com.jmendoza.springboot.kubernetescloud.model.Customer;
import com.jmendoza.springboot.kubernetescloud.repository.InMemoryCustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private InMemoryCustomerRepository inMemoryCustomerRepository;

    @PostMapping(value = "/")
    public ResponseEntity create(@RequestBody final Customer customer) {
        inMemoryCustomerRepository.create(customer);
        return new ResponseEntity("{\"status\": \"Customer Created\"}", HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    public Optional<Customer> get(@PathVariable("id") final String id) {
        return inMemoryCustomerRepository.getById(id);
    }
}
