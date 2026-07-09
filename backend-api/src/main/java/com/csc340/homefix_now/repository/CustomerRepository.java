package com.csc340.homefix_now.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.csc340.homefix_now.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
