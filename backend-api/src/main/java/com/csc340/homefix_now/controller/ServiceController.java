package com.csc340.homefix_now.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.csc340.homefix_now.entity.HomeService;
import com.csc340.homefix_now.service.ServiceService;

@RestController
@RequestMapping("/services")
public class ServiceController {

    private final ServiceService serviceService;

    public ServiceController(ServiceService serviceService) {
        this.serviceService = serviceService;
    }

    // GET all services
    @GetMapping
    public List<HomeService> getServices() {
        return serviceService.getServices();
    }

    // GET service by ID
    @GetMapping("/{id}")
    public HomeService getService(@PathVariable Long id) {
        return serviceService.getService(id);
    }

   @PostMapping("/provider/{providerId}")
public HomeService createService(
        @PathVariable Long providerId,
        @RequestBody HomeService service) {

    return serviceService.createService(providerId, service);
}

    // PUT update a service
    @PutMapping("/{id}")
    public HomeService updateService(@PathVariable Long id,
                                     @RequestBody HomeService service) {
        return serviceService.updateService(id, service);
    }

    // DELETE a service
    @DeleteMapping("/{id}")
    public void deleteService(@PathVariable Long id) {
        serviceService.deleteService(id);
    }

    // GET all services from a provider
    @GetMapping("/provider/{providerId}")
    public List<HomeService> getServicesByProvider(@PathVariable Long providerId) {
        return serviceService.getServicesByProvider(providerId);
    }
}