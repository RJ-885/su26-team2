package com.csc340.homefix_now.service;

import org.springframework.stereotype.Service;

import com.csc340.homefix_now.repository.CustomerRepository;

@Service
public class CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }
}
