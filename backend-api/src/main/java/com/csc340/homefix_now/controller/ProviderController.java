package com.csc340.homefix_now.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.csc340.homefix_now.entity.Provider;
import com.csc340.homefix_now.service.ProviderService;

@RestController
@RequestMapping("/api/providers")
@CrossOrigin(origins = "*")
public class ProviderController {

    private final ProviderService providerService;

    public ProviderController(ProviderService providerService) {
        this.providerService = providerService;
    }

    /**
     * Get all providers.
     */
    @GetMapping
    public List<Provider> getAllProviders() {
        return providerService.getAllProviders();
    }

    /**
     * Get one provider by ID.
     */
    @GetMapping("/{providerId}")
    public Provider getProvider(@PathVariable Long providerId) {
        return providerService.getProvider(providerId);
    }

    /**
     * Create a new provider.
     */
    @PostMapping
    public Provider createProvider(@RequestBody Provider provider) {
        return providerService.createProvider(provider);
    }

    /**
     * Update an existing provider.
     */
    @PutMapping("/{providerId}")
    public Provider updateProvider(
            @PathVariable Long providerId,
            @RequestBody Provider provider) {

        return providerService.updateProvider(providerId, provider);
    }

    /**
     * Delete a provider.
     */
    @DeleteMapping("/{providerId}")
    public void deleteProvider(@PathVariable Long providerId) {
        providerService.deleteProvider(providerId);
    }
}