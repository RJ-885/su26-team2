package com.csc340.homefix_now.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
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

    @ManyToOne
    @JsonIgnoreProperties("")
    @JoinColumn(nullable = false)
    private Customer customer;

    @ManyToOne
    @JsonIgnoreProperties("")
    @JoinColumn(nullable = false)
    private HomeService homeService;

    private String notes;
    private String status;
    private String location;

    /**
     * Need to add Availability file to Entity so Booking can be linked to Availability. 
     * This will allow the Booking to be associated with a specific time slot and date, 
     * ensuring that the provider is available for the requested service. 
     */
    //@OneToOne
    //@JsonIgnoreProperties("provider")
    //@JoinColumn(nullable = false)
    //private Availability availibility;

    public Booking(Customer customer, HomeService homeService, String notes, String status, String location) {
        this.customer = customer;
        this.homeService = homeService;
        this.notes = notes;
        this.status = status;
        this.location = location;
    }
}
