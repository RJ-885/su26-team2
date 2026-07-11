package com.csc340.homefix_now.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.csc340.homefix_now.entity.Timeslot;
import com.csc340.homefix_now.repository.TimeslotRepository;

@Service
public class TimeslotService {

    private final TimeslotRepository timeslotRepository;

    public TimeslotService(TimeslotRepository timeslotRepository) {
        this.timeslotRepository = timeslotRepository;
    }

  public List<Timeslot> getAvailableTimeslotsByProviderId(Long providerId) {
    return timeslotRepository.findByProviderProviderIdAndIsAvailableTrue(providerId);
}

    public Timeslot getTimeslotById(Long timeslotId) {
        return timeslotRepository.findById(timeslotId).orElse(null);
    }

   public List<Timeslot> getTimeslotsByProviderId(Long providerId) {
    return timeslotRepository.findByProviderProviderId(providerId);
}

    public Timeslot createTimeslot(Timeslot timeslot) {
        return timeslotRepository.save(timeslot);
    }

    public Timeslot updateTimeslot(Long id, Timeslot timeslot) {
        Timeslot existingTimeslot = timeslotRepository.findById(id).orElse(null);
        if (existingTimeslot != null) {
            existingTimeslot.setStartTime(timeslot.getStartTime());
            existingTimeslot.setEndTime(timeslot.getEndTime());
            existingTimeslot.setProvider(timeslot.getProvider());
            existingTimeslot.setIsAvailable(timeslot.getIsAvailable());
        }
        return timeslotRepository.save(timeslot);
    }

    public Boolean assignTimeslotToSession(Long timeslotId) {
        Timeslot timeslot = timeslotRepository.findById(timeslotId).orElse(null);
        if (timeslot != null && timeslot.getIsAvailable()) {
            timeslot.setIsAvailable(false);
            timeslotRepository.save(timeslot);
            return true;
        }
        return false;
    }

    public void deleteTimeslot(Long timeslotId) {
        timeslotRepository.deleteById(timeslotId);
    }

}
