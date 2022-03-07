package com.example.airportmanagementsystem.service.impl;

import com.example.airportmanagementsystem.model.binding.AddFlightBindingModel;
import com.example.airportmanagementsystem.model.entity.Airplane;
import com.example.airportmanagementsystem.model.entity.Flight;
import com.example.airportmanagementsystem.repository.FlightRepo;
import com.example.airportmanagementsystem.service.FlightService;
import com.example.airportmanagementsystem.service.RouteService;
import org.springframework.stereotype.Service;

@Service
public class FlightServiceImpl implements FlightService {

    private final FlightRepo flightRepo;
    private final RouteService routeService;

    public FlightServiceImpl(FlightRepo flightRepo, RouteService routeService) {
        this.flightRepo = flightRepo;
        this.routeService = routeService;
    }


    @Override
    public void createFlight(AddFlightBindingModel addFlightBindingModel, Airplane airplane) {
        Flight flight = new Flight()
                .setDestination(routeService.findByRouteNum(addFlightBindingModel.getRouteNum()))
                .setAirplane(airplane);//ToDo
    }
}
