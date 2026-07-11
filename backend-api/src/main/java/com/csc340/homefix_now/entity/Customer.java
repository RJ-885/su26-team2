package com.csc340.homefix_now.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import jakarta.persistence.CascadeType;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "customers")
@Data
@AllArgsConstructor
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long customerId;

    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String bio;
    private String location;
    private String bookings;
    private String reviews;

    
    // Constructors
    public Customer() {
    }

    public Customer(String firstName, String lastName, String email, String phone, String bio, 
        String location, String bookings, String reviews) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.bio = bio;
        this.location = location;
        this.bookings = bookings;
        this.reviews = reviews;
    }

    // Getters and Setters
    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getBookings() {
        return bookings;
    }

    public void setBookings(String bookings) {
        this.bookings = bookings;
    }

    public String getReviews() {
        return reviews;
    }

    public void setReviews(String reviews) {
        this.reviews = reviews;
    }
}

