package com.example.airportmanagementsystem.service.impl;

import com.example.airportmanagementsystem.model.entity.Flight;
import com.example.airportmanagementsystem.model.entity.Seat;
import com.example.airportmanagementsystem.model.entity.Ticket;
import com.example.airportmanagementsystem.model.entity.enums.TicketClass;
import com.example.airportmanagementsystem.model.entity.enums.TicketStatus;
import com.example.airportmanagementsystem.repository.TicketRepo;
import com.example.airportmanagementsystem.service.FlightService;
import com.example.airportmanagementsystem.service.PassengerService;
import com.example.airportmanagementsystem.service.TicketService;
import org.springframework.stereotype.Service;

@Service
public class TicketServiceImpl implements TicketService {

    private final TicketRepo ticketRepo;
    private final FlightService flightService;
    private final PassengerService passengerService;

    public TicketServiceImpl(TicketRepo ticketRepo, FlightService flightService, PassengerService passengerService) {
        this.ticketRepo = ticketRepo;
        this.flightService = flightService;
        this.passengerService = passengerService;
    }

    @Override
    public Ticket createTicket(int countSuitcases , TicketStatus status , TicketClass ticketClass , Flight flight , Seat seat) {
        Ticket ticket = new Ticket()
                .setStatus(status)
                .setTicketClazz(ticketClass)
                .setFlight(flight)
                .setSeat(seat)
                .setCountSuitcases(countSuitcases);

        return ticketRepo.save(ticket);
    }

    @Override
    public Ticket getById(long id) {
        return ticketRepo.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("We don't have a ticket with this " + id + " id!"));
    }

    @Override
    public long count() {
        return ticketRepo.count();
    }


}
