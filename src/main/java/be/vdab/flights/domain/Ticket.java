package be.vdab.flights.domain;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private double price;

    @ManyToOne
    private Passenger passenger;

    @ManyToOne
    private Flight flight;

    public Integer getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
        if(passenger != null) {
            passenger.addTicket(this);
        }
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }
}
