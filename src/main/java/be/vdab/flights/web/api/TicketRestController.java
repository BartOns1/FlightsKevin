package be.vdab.flights.web.api;

import be.vdab.flights.repo.TicketRepository;
import be.vdab.flights.domain.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TicketRestController {
    @Autowired
    TicketRepository tr;

    @RequestMapping(method= RequestMethod.GET, path = "api/ticket/all", produces = "application/json")
    public List<Ticket> allTickets() {
        return tr.findAll();
    }

    @RequestMapping(method= RequestMethod.GET, path = "api/ticket/{tid}", produces = "application/json")
    public Ticket getById(@PathVariable("tid") int id) {
        return tr.findOne(id);
    }

    @RequestMapping(method= RequestMethod.DELETE, path = "api/ticket/{tid}")
    public void deleteById(@PathVariable("tid") int id) {
        tr.delete(id);
    }
}
