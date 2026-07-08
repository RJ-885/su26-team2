package com.csc340.homefix_now.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.csc340.homefix_now.service.ProviderService;

@RestController
@RequestMapping("/api/providers")

public class ProviderController {
    
    private final ProviderService providerService;

    public ProviderController(ProviderService providerService) {
        this.providerService = providerService;
    }

}