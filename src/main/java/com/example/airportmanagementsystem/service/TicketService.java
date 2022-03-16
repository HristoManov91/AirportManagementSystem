package com.example.airportmanagementsystem.service;

import com.example.airportmanagementsystem.model.entity.Flight;
import com.example.airportmanagementsystem.model.entity.Seat;
import com.example.airportmanagementsystem.model.entity.Ticket;
import com.example.airportmanagementsystem.model.entity.enums.TicketClass;
import com.example.airportmanagementsystem.model.entity.enums.TicketStatus;

public interface TicketService {

    Ticket createTicket(int countSuitcases , TicketStatus status , TicketClass ticketClass , Flight flight , Seat seat);

    Ticket getById(long id);

    long count();
}
