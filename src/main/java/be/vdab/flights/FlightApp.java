package be.vdab.flights;

import be.vdab.flights.domain.Passenger;
import be.vdab.flights.repo.PassengerRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FlightApp {
    public static void main(String[] args) {
        ApplicationContext ac = SpringApplication.run(FlightApp.class, args);

        PassengerRepository pr = ac.getBean(PassengerRepository.class);

        Passenger p = new Passenger("Jimi", "Hendrix");
        pr.save(p);

//        String m = ac.getBean("message", String.class);
//        System.out.println(m);
    }

}
