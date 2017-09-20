package be.vdab.flights.service;

import be.vdab.flights.domain.Flight;
import be.vdab.flights.domain.Passenger;
import be.vdab.flights.domain.Ticket;
import be.vdab.flights.repo.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketService {
    @Autowired
    private TicketRepository ticketRepository;

    public Ticket create(Flight flight, double price, Passenger passenger) {
        System.out.println("Create ticket from ticket service");
//        return ticketRepository.save(passenger);
        return null;
    }
}
