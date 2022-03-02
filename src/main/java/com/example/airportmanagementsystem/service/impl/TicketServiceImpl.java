package com.example.airportmanagementsystem.service.impl;

import com.example.airportmanagementsystem.repository.TicketRepo;
import com.example.airportmanagementsystem.service.TicketService;
import org.springframework.stereotype.Service;

@Service
public class TicketServiceImpl implements TicketService {

    private final TicketRepo ticketRepo;

    public TicketServiceImpl(TicketRepo ticketRepo) {
        this.ticketRepo = ticketRepo;
    }
}
