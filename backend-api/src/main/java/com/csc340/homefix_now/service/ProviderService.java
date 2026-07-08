package com.csc340.homefix_now.service;

import org.springframework.stereotype.Service;

import com.csc340.homefix_now.repository.ProviderRepository;

@Service
public class ProviderService {
    private final ProviderRepository providerRepository;

    public ProviderService(ProviderRepository providerRepository) {
        this.providerRepository = providerRepository;
    
    }
}
