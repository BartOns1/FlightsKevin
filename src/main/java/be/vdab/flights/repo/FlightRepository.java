package be.vdab.flights.repo;

import be.vdab.flights.domain.Flight;
import be.vdab.flights.domain.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FlightRepository extends JpaRepository<Flight, Integer> {
    // Empty for now

//    Flight queryByFlightNumber(String flightNumber) {}


    Flight readByNumber(String flightNumber);

    Flight getByDepartureAndDestination(String dep, String des);
}






interface TicketRepository2 extends JpaRepository<Ticket, Integer> {
    @Query("select distinct t.price from Ticket t")
    int getAveragePrice();
}