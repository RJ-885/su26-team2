package com.csc340.homefix_now.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.csc340.homefix_now.entity.Customer;
import com.csc340.homefix_now.repository.CustomerRepository;

@Service
public class CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    public Customer getCustomerById(Long customerId) {
        return customerRepository.findById(customerId).orElse(null);
    }

    public Customer createCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    public Customer updateCustomer(Long customerId, Customer updatedCustomer) {
        Optional<Customer> optionalCustomer = customerRepository.findById(customerId);
        if (optionalCustomer.isPresent()) {
            Customer existingCustomer = optionalCustomer.get();
            existingCustomer.setFirstName(updatedCustomer.getFirstName());
            existingCustomer.setLastName(updatedCustomer.getLastName());
            existingCustomer.setEmail(updatedCustomer.getEmail());
            existingCustomer.setPhone(updatedCustomer.getPhone());
            existingCustomer.setBio(updatedCustomer.getBio());
            existingCustomer.setLocation(updatedCustomer.getLocation());
            return customerRepository.save(existingCustomer);
        } else {
            return null; // or throw an exception
        }
    }

    public Customer updatePersonalInfo(Long customerId, Customer updatedCustomer) {
        Optional<Customer> optionalCustomer = customerRepository.findById(customerId);
        if (optionalCustomer.isPresent()) {
            Customer existingCustomer = optionalCustomer.get();
            existingCustomer.setFirstName(updatedCustomer.getFirstName());
            existingCustomer.setLastName(updatedCustomer.getLastName());
            existingCustomer.setEmail(updatedCustomer.getEmail());
            existingCustomer.setPhone(updatedCustomer.getPhone());
            return customerRepository.save(existingCustomer);
        } else {
            return null; // or throw an exception
        }
    }

    public void deleteCustomer(Long customerId) {
        customerRepository.deleteById(customerId);
    }

    public Customer findByEmail(String email) {
        return customerRepository.findByEmail(email);
    }
}
