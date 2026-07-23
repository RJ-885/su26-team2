package com.csc340.homefix_now.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "providers")
@Data
@AllArgsConstructor
public class Provider {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long providerId;

    private String firstName;
    private String lastName;
    private String businessName;
    private String email;
    private String phone;
    private String specialty;
    private String bio;
    private String location;

    // Provider Profile Information
    private Integer yearsExperience;
    private Double hourlyRate;
    private Boolean freeEstimates;
    private Boolean insured;
    private String availability;

    // Provider Login
    private String password;

    @OneToMany(mappedBy = "provider", cascade = CascadeType.ALL)
    private List<HomeService> services = new ArrayList<>();

    // Required by JPA
    public Provider() {
    }

    // Constructor used when creating a new provider
    public Provider(String firstName,
                    String lastName,
                    String businessName,
                    String email,
                    String phone,
                    String specialty,
                    String bio,
                    String location,
                    Integer yearsExperience,
                    Double hourlyRate,
                    Boolean freeEstimates,
                    Boolean insured,
                    String availability,
                    String password) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.businessName = businessName;
        this.email = email;
        this.phone = phone;
        this.specialty = specialty;
        this.bio = bio;
        this.location = location;
        this.yearsExperience = yearsExperience;
        this.hourlyRate = hourlyRate;
        this.freeEstimates = freeEstimates;
        this.insured = insured;
        this.availability = availability;
        this.password = password;
    }
}