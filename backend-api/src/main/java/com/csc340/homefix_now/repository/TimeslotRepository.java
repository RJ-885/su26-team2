package com.csc340.homefix_now.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.csc340.homefix_now.entity.Timeslot;

@Repository
public interface TimeslotRepository extends JpaRepository<Timeslot, Long>{
    List<Timeslot> findByProviderId(Long providerId);

    List<Timeslot> findAvailableByProvider(Long providerId);
}
