package com.csc340.homefix_now.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "replies")
public class Reply {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long replyId;

    @Column(nullable = false, length = 1000)
    private String replyText;

    @ManyToOne
    @JoinColumn(name = "review_id", nullable = false)
    private Review review;

    public Reply() {
    }

    public Reply(String replyText, Review review) {
        this.replyText = replyText;
        this.review = review;
    }

    public Long getReplyId() {
        return replyId;
    }

    public void setReplyId(Long replyId) {
        this.replyId = replyId;
    }

    public String getReplyText() {
        return replyText;
    }

    public void setReplyText(String replyText) {
        this.replyText = replyText;
    }

    public Review getReview() {
        return review;
    }

    public void setReview(Review review) {
        this.review = review;
    }
}