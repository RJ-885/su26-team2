package com.csc340.homefix_now.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csc340.homefix_now.entity.Reply;
import com.csc340.homefix_now.entity.Review;
import com.csc340.homefix_now.repository.ReplyRepository;
import com.csc340.homefix_now.repository.ReviewRepository;

@Service
public class ReplyService {

    @Autowired
    private ReplyRepository replyRepository;

    @Autowired
    private ReviewRepository reviewRepository;

    /**
     * Creates a reply for a review.
     */
    public Reply createReply(Long reviewId, Reply reply) {

        Review review = reviewRepository.findById(reviewId)
                .orElseThrow(() ->
                        new RuntimeException("Review not found."));

        reply.setReview(review);

        Reply savedReply = replyRepository.save(reply);

        review.setReply(savedReply);
        reviewRepository.save(review);

        return savedReply;
    }

    /**
     * Returns a reply by its id.
     */
    public Reply getReply(Long replyId) {
        return replyRepository.findById(replyId)
                .orElseThrow(() ->
                        new RuntimeException("Reply not found."));
    }

    /**
     * Update an existing reply.
     */
    public Reply updateReply(Long replyId, Reply updatedReply) {

        Reply existingReply = replyRepository.findById(replyId)
                .orElseThrow(() ->
                        new RuntimeException("Reply not found."));

       existingReply.setReplyText(updatedReply.getReplyText());

        return replyRepository.save(existingReply);
    }

    /**
     * Delete a reply.
     */
    public void deleteReply(Long replyId) {
        replyRepository.deleteById(replyId);
    }
}