package com.csc340.homefix_now.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.csc340.homefix_now.entity.Booking;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {
    Booking findByCustomerIdAndHomeServiceId(Long customerId, Long availibilityId);
    List<Booking> findByBookingId(Long bookingId);
    List<Booking> findByCustomerId(Long customerId);
    List<Booking> findByHomeServiceId(Long homeServiceId);
}
