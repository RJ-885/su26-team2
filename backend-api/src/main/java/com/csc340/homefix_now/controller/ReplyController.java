package com.csc340.homefix_now.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.csc340.homefix_now.entity.Reply;
import com.csc340.homefix_now.service.ReplyService;

@RestController
@RequestMapping("/replies")
@CrossOrigin(origins = "*")
public class ReplyController {

    @Autowired
    private ReplyService replyService;

    /**
     * POST a reply to a review.
     */
    @PostMapping("/review/{reviewId}")
    public Reply createReply(
            @PathVariable Long reviewId,
            @RequestBody Reply reply) {

        return replyService.createReply(reviewId, reply);
    }

    /**
     * GET a reply by id.
     */
    @GetMapping("/{replyId}")
    public Reply getReply(@PathVariable Long replyId) {
        return replyService.getReply(replyId);
    }

    /**
     * PUT update a reply.
     */
    @PutMapping("/{replyId}")
    public Reply updateReply(
            @PathVariable Long replyId,
            @RequestBody Reply reply) {

        return replyService.updateReply(replyId, reply);
    }

    /**
     * DELETE a reply.
     */
    @DeleteMapping("/{replyId}")
    public void deleteReply(@PathVariable Long replyId) {
        replyService.deleteReply(replyId);
    }
}