package com.example.airportmanagementsystem.service.impl;

import com.example.airportmanagementsystem.model.binding.AddFlightBindingModel;
import com.example.airportmanagementsystem.model.entity.Airplane;
import com.example.airportmanagementsystem.model.entity.Flight;
import com.example.airportmanagementsystem.repository.FlightRepo;
import com.example.airportmanagementsystem.service.FlightService;
import org.springframework.stereotype.Service;

@Service
public class FlightServiceImpl implements FlightService {

    private final FlightRepo flightRepo;

    public FlightServiceImpl(FlightRepo flightRepo) {
        this.flightRepo = flightRepo;
    }


//    @Override
//    public void createFlight(AddFlightBindingModel addFlightBindingModel, Airplane airplane) {
//        Flight flight = new Flight();
//    }
}
