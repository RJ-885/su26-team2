package com.csc340.homefix_now.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.csc340.homefix_now.entity.Provider;
import com.csc340.homefix_now.repository.ProviderRepository;

@Service
public class ProviderService {

    private final ProviderRepository providerRepository;

    public ProviderService(ProviderRepository providerRepository) {
        this.providerRepository = providerRepository;
    }

    /**
     * Get all providers.
     */
    public List<Provider> getAllProviders() {
        return providerRepository.findAll();
    }

    /**
     * Get one provider.
     */
    public Provider getProvider(Long providerId) {
        return providerRepository.findById(providerId)
                .orElseThrow(() -> new RuntimeException("Provider not found."));
    }

    public List<Provider> findBySpecialty(String specialty) {
        return providerRepository.findBySpecialty(specialty);

    }

    /**
     * Create a provider.
     */
    public Provider createProvider(Provider provider) {
        return providerRepository.save(provider);
    }

    /**
     * Update a provider.
     */
    public Provider updateProvider(Long providerId, Provider updatedProvider) {

        Provider provider = providerRepository.findById(providerId)
                .orElseThrow(() -> new RuntimeException("Provider not found."));

        provider.setFirstName(updatedProvider.getFirstName());
        provider.setLastName(updatedProvider.getLastName());
        provider.setBusinessName(updatedProvider.getBusinessName());
        provider.setEmail(updatedProvider.getEmail());
        provider.setPhone(updatedProvider.getPhone());
        provider.setSpecialty(updatedProvider.getSpecialty());
        provider.setBio(updatedProvider.getBio());
        provider.setLocation(updatedProvider.getLocation());

        return providerRepository.save(provider);
    }

    /**
     * Delete a provider.
     */
    public void deleteProvider(Long providerId) {
        providerRepository.deleteById(providerId);
    }

    public Provider findByEmail(String email) {
        return providerRepository.findByEmail(email);
    }

}