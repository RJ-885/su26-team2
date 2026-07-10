package com.csc340.homefix_now.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

@Entity
@Table(name = "reviews")
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reviewId;

    @Column(nullable = false)
    private Integer rating;

    @Column(length = 1000)
    private String comment;

    @ManyToOne
    @JoinColumn(name = "service_id", nullable = false)
    @JsonIgnoreProperties({"reviews", "provider"})
    private HomeService service;

    @OneToOne(mappedBy = "review", cascade = CascadeType.ALL)
    @JsonIgnoreProperties("review")
    private Reply reply;

    public Review() {
    }

    public Review(Integer rating, String comment, HomeService service) {
        this.rating = rating;
        this.comment = comment;
        this.service = service;
    }

    public Long getReviewId() {
        return reviewId;
    }

    public void setReviewId(Long reviewId) {
        this.reviewId = reviewId;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public HomeService getService() {
        return service;
    }

    public void setService(HomeService service) {
        this.service = service;
    }

    public Reply getReply() {
        return reply;
    }

    public void setReply(Reply reply) {
        this.reply = reply;
    }
}