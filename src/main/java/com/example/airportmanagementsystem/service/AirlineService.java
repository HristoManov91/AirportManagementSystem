package com.example.airportmanagementsystem.service;

import com.example.airportmanagementsystem.model.binding.AddRouteBindingModel;
import com.example.airportmanagementsystem.model.binding.CreateAirlineBindingModel;
import com.example.airportmanagementsystem.model.binding.CreateAirplaneBindingModel;
import com.example.airportmanagementsystem.model.entity.Airline;
import com.example.airportmanagementsystem.model.entity.Flight;
import com.example.airportmanagementsystem.model.entity.Route;

public interface AirlineService {

    void initAirline();

    Airline createAirline(CreateAirlineBindingModel createAirlineBindingModel);

    void addAirplane(CreateAirplaneBindingModel createAirplaneBindingModel);


    Airline findByIataCode(String iataCode);

    void createRoute(AddRouteBindingModel addRouteBindingModel);
}
