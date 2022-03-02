package com.example.airportmanagementsystem.service;

import com.example.airportmanagementsystem.model.binding.CreateAirportBindingModel;
import com.example.airportmanagementsystem.model.entity.Airport;

public interface AirportService {

    void initAirports();

    Airport createAirport(CreateAirportBindingModel createAirportBindingModel);
}
