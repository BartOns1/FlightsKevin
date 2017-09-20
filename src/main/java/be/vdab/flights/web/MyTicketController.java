package be.vdab.flights.web;

import be.vdab.flights.domain.Ticket;
import be.vdab.flights.repo.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
public class MyTicketController {
    @Autowired
    TicketRepository tr;


    @RequestMapping("tickets.html")
    public String myBlaBlaTickets(Map<String, Object> model) {

        List<Ticket> ticketList = tr.findAll();
        model.put("flightTickets", ticketList);

        return "myTicketList";
    }
}
