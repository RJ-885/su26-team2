package com.csc340.homefix_now.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "bookings")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Booking {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookingId;

    @OneToOne
    @JsonIgnoreProperties({ "bookings" })
    @JoinColumn(nullable = false)
    private Customer customer;

    @ManyToOne
    @JsonIgnoreProperties({ "provider" })
    @JoinColumn(nullable = false)
    private HomeService homeService;

    private String notes;
    private String status;
    private String location;

    @OneToOne
    @JsonIgnoreProperties("")
    @JoinColumn(nullable = false)
    private Timeslot timeslot;

    public Booking(Customer customer, HomeService homeService, Timeslot timeslot, String notes, String status, String location) {
        this.customer = customer;
        this.homeService = homeService;
        this.timeslot = timeslot;
        this.notes = notes;
        this.status = status;
        this.location = location;
    }
}
