package com.csc340.homefix_now.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.csc340.homefix_now.entity.Review;
import com.csc340.homefix_now.service.ReviewService;

@RestController
@RequestMapping("/reviews")
@CrossOrigin(origins = "*")
public class ReviewController {

    @Autowired
    private ReviewService reviewService;

    /**
     * GET all reviews.
     */
    @GetMapping("")
    public List<Review> getAllReviews() {
        return reviewService.getAllReviews();
    }

    /**
     * GET reviews for a service.
     */
    @GetMapping("/service/{serviceId}")
    public List<Review> getReviewsByService(@PathVariable Long serviceId) {
        return reviewService.getReviewsByService(serviceId);
    }

    /**
 * GET all reviews for a provider.
 */
@GetMapping("/provider/{providerId}")
public List<Review> getReviewsByProvider(
        @PathVariable Long providerId) {

    return reviewService.getReviewsByProvider(providerId);
}

    /**
     * POST a new review.
     */
    @PostMapping("/service/{serviceId}")
    public Review createReview(
            @PathVariable Long serviceId,
            @RequestBody Review review) {

        return reviewService.createReview(serviceId, review);
    }

    /**
     * DELETE a review.
     */
    @DeleteMapping("/{reviewId}")
    public void deleteReview(@PathVariable Long reviewId) {
        reviewService.deleteReview(reviewId);
    }
}