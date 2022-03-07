package com.example.airportmanagementsystem.service;

import com.example.airportmanagementsystem.model.binding.AddFlightBindingModel;
import com.example.airportmanagementsystem.model.entity.Airplane;
import com.example.airportmanagementsystem.model.entity.Flight;

public interface FlightService {


    void createFlight(AddFlightBindingModel addFlightBindingModel, Airplane airplane);
}
