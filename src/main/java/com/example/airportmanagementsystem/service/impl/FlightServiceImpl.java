package com.example.airportmanagementsystem.service.impl;

import com.example.airportmanagementsystem.repository.FlightRepo;
import com.example.airportmanagementsystem.service.FlightService;
import org.springframework.stereotype.Service;

@Service
public class FlightServiceImpl implements FlightService {

    private final FlightRepo flightRepo;

    public FlightServiceImpl(FlightRepo flightRepo) {
        this.flightRepo = flightRepo;
    }

    //ToDo create flights
}
