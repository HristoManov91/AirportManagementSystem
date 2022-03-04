package com.example.airportmanagementsystem.init;

import com.example.airportmanagementsystem.service.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseInit implements CommandLineRunner {

    private final AirlineService airlineService;
    private final AirportService airportService;
    private final AirplaneService airplaneService;
    private final FlightService flightService;
    private final PassengerService passengerService;

    public DatabaseInit(AirlineService airlineService, AirportService airportService, AirplaneService airplaneService,
                        FlightService flightService, PassengerService passengerService) {

        this.airlineService = airlineService;
        this.airportService = airportService;
        this.airplaneService = airplaneService;
        this.flightService = flightService;
        this.passengerService = passengerService;
    }

    @Override
    public void run(String... args) throws Exception {
        airportService.initAirports();
        airlineService.initAirline();
    }
}
