package com.example.airportmanagementsystem.service;

import com.example.airportmanagementsystem.model.binding.AddFlightBindingModel;
import com.example.airportmanagementsystem.model.binding.AirportBindingModel;
import com.example.airportmanagementsystem.model.entity.Airport;

public interface AirportService {

    void initAirports();

    Airport createAirport(AirportBindingModel airportBindingModel);

    Airport findByIataCode(String iataCode);

    Airport updateAirport(AirportBindingModel airportBindingModel);

    void deleteAirport(String iataCode);

    String addFlight(AddFlightBindingModel addFlightBindingModel);
}
