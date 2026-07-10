package com.csc340.homefix_now.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class HomeService {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long serviceId;

    private String serviceName;
    private String description;
    private Double price;

@ManyToOne
@JoinColumn(name = "provider_id")
@JsonIgnoreProperties("services")
private Provider provider;

    // Default constructor
    public HomeService() {
    }

    // Constructor
    public HomeService(String serviceName, String description, Double price, Provider provider) {
        this.serviceName = serviceName;
        this.description = description;
        this.price = price;
        this.provider = provider;
    }

    // Getters and Setters

    public Long getServiceId() {
        return serviceId;
    }

    public void setServiceId(Long serviceId) {
        this.serviceId = serviceId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }
}