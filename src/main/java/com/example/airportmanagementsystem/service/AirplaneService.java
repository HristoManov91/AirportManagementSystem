package com.example.airportmanagementsystem.service;

import com.example.airportmanagementsystem.model.binding.CreateAirplaneBindingModel;
import com.example.airportmanagementsystem.model.entity.Airline;
import com.example.airportmanagementsystem.model.entity.Airplane;

public interface AirplaneService {

    Airplane createAirplane(Airline airline , CreateAirplaneBindingModel createAirplaneBindingModel);

    Airplane findByARN(String airplaneARN);
}
