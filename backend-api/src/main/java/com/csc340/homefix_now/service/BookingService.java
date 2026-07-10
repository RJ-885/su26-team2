package com.csc340.homefix_now.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.csc340.homefix_now.entity.Booking;
import com.csc340.homefix_now.repository.BookingRepository;

@Service
public class BookingService {
    
    private final BookingRepository bookingRepository;

    public BookingService(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    public List<Booking> getBookingsByCustomerId(Long customerId) {
        return bookingRepository.findByCustomerId(customerId);
    }

    public List<Booking> getBookingsByHomeServiceId(Long homeServiceId) {
        return bookingRepository.findByHomeServiceId(homeServiceId);
    }

    public Booking createBooking(Booking booking) {
        return bookingRepository.save(booking);
    }

    public List<Booking> getAllBookings() {
        return bookingRepository.findAll();
    }

    public Booking getBookingById(Long bookingId) {
        return bookingRepository.findById(bookingId).orElse(null);
    }

    public Booking updateBooking(Booking booking) {
        Booking existingBooking = bookingRepository.findById(booking.getBookingId()).orElse(null);
        if (existingBooking != null) {
            existingBooking.setCustomer(booking.getCustomer());
            existingBooking.setHomeService(booking.getHomeService());
            existingBooking.setLocation(booking.getLocation());
            //existingBooking.setTimeslot(booking.getTimeslot());
            existingBooking.setStatus(booking.getStatus());
        }
        return bookingRepository.save(booking);
    }

    public void deleteBooking(Long bookingId) {
        bookingRepository.deleteById(bookingId);
    }

    public Booking cancelBooking(Long bookingId) {
        Booking existingBooking = bookingRepository.findById(bookingId).orElse(null);
        if (existingBooking != null) {
            existingBooking.setStatus("Cancelled");
            return bookingRepository.save(existingBooking);
        }
        return null;
    }
}
