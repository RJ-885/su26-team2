package com.csc340.homefix_now.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.csc340.homefix_now.entity.HomeService;
import com.csc340.homefix_now.entity.Provider;
import com.csc340.homefix_now.repository.ProviderRepository;
import com.csc340.homefix_now.repository.ServiceRepository;

@Service
public class ServiceService {

    private final ServiceRepository serviceRepository;
    private final ProviderRepository providerRepository;

    public ServiceService(ServiceRepository serviceRepository,
                          ProviderRepository providerRepository) {
        this.serviceRepository = serviceRepository;
        this.providerRepository = providerRepository;
    }

    /**
     * Get all services.
     */
    public List<HomeService> getServices() {
        return serviceRepository.findAll();
    }

    /**
     * Get one service by ID.
     */
    public HomeService getService(Long id) {
        return serviceRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Service not found."));
    }

    /**
     * Create a new service for a provider.
     */
    public HomeService createService(Long providerId, HomeService service) {

        Provider provider = providerRepository.findById(providerId)
                .orElseThrow(() -> new RuntimeException("Provider not found."));

        service.setProvider(provider);

        return serviceRepository.save(service);
    }

    /**
     * Update an existing service.
     */
    public HomeService updateService(Long id, HomeService updatedService) {

        HomeService service = serviceRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Service not found."));

        service.setServiceName(updatedService.getServiceName());
        service.setDescription(updatedService.getDescription());
        service.setPrice(updatedService.getPrice());

        return serviceRepository.save(service);
    }

    /**
     * Delete a service.
     */
    public void deleteService(Long id) {
        serviceRepository.deleteById(id);
    }

    /**
     * Get all services owned by a provider.
     */
    public List<HomeService> getServicesByProvider(Long providerId) {
        return serviceRepository.findByProviderProviderId(providerId);
    }
}