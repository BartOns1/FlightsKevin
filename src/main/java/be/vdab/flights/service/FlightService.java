package be.vdab.flights.service;

import be.vdab.flights.domain.Flight;
import be.vdab.flights.repo.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlightService {
    @Autowired
    private FlightRepository flightRepository;

    public Flight findById(int id) {
        System.out.println("Find flight by id");
        return null;
    }

    public Flight findByFlightNumber(String flightNumber) {
        return flightRepository.readByNumber(flightNumber);
    }
}
