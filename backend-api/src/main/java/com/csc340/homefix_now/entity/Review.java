package com.csc340.homefix_now.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "reviews")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Review {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reviewId;

    @ManyToOne
    @JsonIgnoreProperties("reviews")
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @ManyToOne
    @JsonIgnoreProperties("reviews")
    @JoinColumn(name = "provider_id")
    private Provider provider;
    
    private int rating;
    private String comment;
    private String replyText;

    public Review(Customer customer, Provider provider, int rating, String comment, String replyText) {
        this.customer = customer;
        this.provider = provider;
        this.rating = rating;
        this.comment = comment;
        this.replyText = replyText;
    }
}
