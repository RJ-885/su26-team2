package com.csc340.homefix_now.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.csc340.homefix_now.entity.HomeService;

@Repository
public interface ServiceRepository extends JpaRepository<HomeService, Long> {

    // Find services from a specific provider by providerId
    
    List<HomeService> findByProviderProviderId(Long providerId);

}