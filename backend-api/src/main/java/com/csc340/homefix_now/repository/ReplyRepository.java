package com.csc340.homefix_now.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.csc340.homefix_now.entity.Reply;

@Repository
public interface ReplyRepository extends JpaRepository<Reply, Long> {

}