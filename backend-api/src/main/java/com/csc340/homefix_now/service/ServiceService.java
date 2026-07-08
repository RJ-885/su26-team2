package com.csc340.homefix_now.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.csc340.homefix_now.entity.HomeService;
import com.csc340.homefix_now.repository.ServiceRepository;

@Service
public class ServiceService {

    private final ServiceRepository serviceRepository;

    public ServiceService(ServiceRepository serviceRepository) {
        this.serviceRepository = serviceRepository;
    }

    public List<HomeService> getServices() {
        return serviceRepository.findAll();
    }

    public HomeService getService(Long id) {
        return serviceRepository.findById(id).orElse(null);
    }

    public HomeService createService(HomeService service) {
        return serviceRepository.save(service);
    }

    public HomeService updateService(Long id, HomeService updatedService) {

        HomeService service = serviceRepository.findById(id).orElse(null);

        if (service == null) {
            return null;
        }

        service.setServiceName(updatedService.getServiceName());
        service.setDescription(updatedService.getDescription());
        service.setPrice(updatedService.getPrice());
        service.setProvider(updatedService.getProvider());

        return serviceRepository.save(service);
    }

    public void deleteService(Long id) {
        serviceRepository.deleteById(id);
    }

    public List<HomeService> getServicesByProvider(Long providerId) {
        return serviceRepository.findByProviderProviderId(providerId);
    }
}