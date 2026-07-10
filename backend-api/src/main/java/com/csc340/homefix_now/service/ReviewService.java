package com.csc340.homefix_now.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csc340.homefix_now.entity.HomeService;
import com.csc340.homefix_now.entity.Review;
import com.csc340.homefix_now.repository.ReviewRepository;
import com.csc340.homefix_now.repository.ServiceRepository;

@Service
public class ReviewService {

    @Autowired
    private ReviewRepository reviewRepository;

    @Autowired
    private ServiceRepository serviceRepository;

    /**
     * Return every review.
     */
    public List<Review> getAllReviews() {
        return reviewRepository.findAll();
    }

    /**
     * Return every review for a specific service.
     */
    public List<Review> getReviewsByService(Long serviceId) {
        return reviewRepository.findByServiceServiceId(serviceId);
    }

    /**
     * Create a review for a service.
     */
    public Review createReview(Long serviceId, Review review) {

        HomeService service = serviceRepository.findById(serviceId)
                .orElseThrow(() ->
                        new RuntimeException("Service not found."));

        review.setService(service);

        return reviewRepository.save(review);
    }

    /**
     * Deletes a review.
     */
    public void deleteReview(Long reviewId) {
        reviewRepository.deleteById(reviewId);
    }

    /**
 * Returns all reviews for every service owned by a provider.
 */
public List<Review> getReviewsByProvider(Long providerId) {
    return reviewRepository.findByServiceProviderProviderId(providerId);
}


}
