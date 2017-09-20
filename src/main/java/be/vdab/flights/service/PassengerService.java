package be.vdab.flights.service;

import be.vdab.flights.domain.Passenger;
import be.vdab.flights.repo.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PassengerService {
    @Autowired
    private PassengerRepository passengerRepository;

    public List<String> getAll() {
        System.out.println("Passenger service find all");
        return new ArrayList<>();
    }

    public Passenger findById(int id) {
        System.out.println("Passenger service find by id " + id);
        return passengerRepository.findOne(id);
    }
}
