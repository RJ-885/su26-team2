package com.csc340.homefix_now.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.csc340.homefix_now.entity.Timeslot;
import com.csc340.homefix_now.service.TimeslotService;

@RestController
@RequestMapping("/api/timeslots")
public class TimeslotController {
    
    private final TimeslotService timeslotService;

    public TimeslotController(TimeslotService timeslotService) {
        this.timeslotService = timeslotService;
    }

    @GetMapping("/provider/{providerId}")
    public ResponseEntity<List<Timeslot>> getTimeslotsByProviderId(@PathVariable Long providerId) {
        List<Timeslot> timeslots = timeslotService.getTimeslotsByProviderId(providerId);
        return ResponseEntity.ok(timeslots);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Timeslot> getTimeslotById(@PathVariable long id) {
        Timeslot timeslot = timeslotService.getTimeslotById(id);
        if (timeslot == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(timeslot);
    }

    @GetMapping("/provider/{providerId}/available")
    public ResponseEntity<List<Timeslot>> getAvailableTimeslotsByProviderId(@PathVariable Long providerId) {
        List<Timeslot> availableTimeslots = timeslotService.getAvailableTimeslotsByProviderId(providerId);
        return ResponseEntity.ok(availableTimeslots);
    }

    @PostMapping
    public ResponseEntity<Timeslot> createTimeslot(@RequestBody Timeslot timeslot) {
        Timeslot createdTimeslot = timeslotService.createTimeslot(timeslot);
        return ResponseEntity.ok(createdTimeslot);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Timeslot> updateTimeslot(@PathVariable Long id, @RequestBody Timeslot timeslot) {
        Timeslot updatedTimeslot = timeslotService.updateTimeslot(id, timeslot);
        if (updatedTimeslot == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(updatedTimeslot);
    }
}
