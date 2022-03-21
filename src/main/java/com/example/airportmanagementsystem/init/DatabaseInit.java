package com.example.airportmanagementsystem.init;

import com.example.airportmanagementsystem.model.entity.enums.TicketClass;
import com.example.airportmanagementsystem.model.entity.enums.TicketStatus;
import com.example.airportmanagementsystem.service.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseInit implements CommandLineRunner {

    private final AirplaneService airplaneService;
    private final TicketService ticketService;
    private final FlightService flightService;
    private final SeatService seatService;
    private final PassportService passportService;
    private final PassengerService passengerService;

    public DatabaseInit(AirplaneService airplaneService, TicketService ticketService, FlightService flightService, SeatService seatService, PassportService passportService, PassengerService passengerService) {
        this.airplaneService = airplaneService;
        this.ticketService = ticketService;
        this.flightService = flightService;
        this.seatService = seatService;
        this.passportService = passportService;
        this.passengerService = passengerService;
    }


    @Override
    public void run(String... args) throws Exception {
        airplaneService.initSeatsForPlanes();
        initTickets();
        initPassengers();
    }

    private void initPassengers() {
        if (passengerService.count() == 0){
            passengerService.initPassenger(ticketService.getById(1L) , passportService.getById(1L) , "VIP");
            passengerService.initPassenger(ticketService.getById(2L) , passportService.getById(2L) , null);
            passengerService.initPassenger(ticketService.getById(3L) , passportService.getById(3L) , null);
            passengerService.initPassenger(ticketService.getById(4L) , passportService.getById(4L) , null);
            passengerService.initPassenger(ticketService.getById(5L) , passportService.getById(5L) , null);
            passengerService.initPassenger(ticketService.getById(6L) , passportService.getById(6L) , null);
            passengerService.initPassenger(ticketService.getById(7L) , passportService.getById(7L) , "Old lady with dog");
        }
    }

    private void initTickets() {
        if (ticketService.count() == 0){
            ticketService.createTicket(1 , TicketStatus.CHECKED_IN , TicketClass.BUSINESS ,
                    flightService.getFlightById(1L) , seatService.getSeatById(1L));

            ticketService.createTicket(2 , TicketStatus.CHECKED_IN , TicketClass.BUSINESS ,
                    flightService.getFlightById(1L) , seatService.getSeatById(13L));

            ticketService.createTicket(1 , TicketStatus.CHECKED_IN , TicketClass.FIRST ,
                    flightService.getFlightById(1L) , seatService.getSeatById(52L));

            ticketService.createTicket(2 , TicketStatus.CHECKED_IN , TicketClass.FIRST ,
                    flightService.getFlightById(1L) , seatService.getSeatById(77L));

            ticketService.createTicket(3 , TicketStatus.CHECKED_IN , TicketClass.ECONOMY ,
                    flightService.getFlightById(1L) , seatService.getSeatById(111L));

            ticketService.createTicket(1 , TicketStatus.CHECKED_IN , TicketClass.ECONOMY ,
                    flightService.getFlightById(1L) , seatService.getSeatById(112L));

            ticketService.createTicket(2 , TicketStatus.CHECKED_IN , TicketClass.ECONOMY ,
                    flightService.getFlightById(1L) , seatService.getSeatById(151L));
        }
    }
}
