package com.example.airportmanagementsystem.service;

import com.example.airportmanagementsystem.model.binding.AddRouteBindingModel;
import com.example.airportmanagementsystem.model.binding.AirlineBindingModel;
import com.example.airportmanagementsystem.model.binding.AirplaneBindingModel;
import com.example.airportmanagementsystem.model.entity.Airline;

import java.util.List;

public interface AirlineService {

    Airline createAirline(AirlineBindingModel airlineBindingModel);

    Airline findByIataCode(String iataCode);

    Airline findByName(String name);

    Airline updateAirline(AirlineBindingModel airlineBindingModel);

    void deleteAirline(String iataCode);

    void addAirplane(AirplaneBindingModel airplaneBindingModel);

    void createRoute(AddRouteBindingModel addRouteBindingModel);

    List<AirlineBindingModel> getAllAirlines();
}
