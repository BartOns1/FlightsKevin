package be.vdab.flights.service;

import be.vdab.flights.domain.Flight;
import be.vdab.flights.domain.Passenger;
import be.vdab.flights.domain.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ReservationService {
    @Autowired
    TicketService ticketService;

    @Autowired
    PassengerService passengerService;

    @Autowired
    FlightService flightService;

    public Ticket bookTicketForFlight(int passengerId, String flightNumber) {
        System.out.println("Booking ticket for flight");

        Passenger p = passengerService.findById(passengerId);

        Flight f = flightService.findByFlightNumber(flightNumber);

        Ticket t = ticketService.create(f, 499.95, p);
        return t;
    }
}
