package com.example.airportmanagementsystem.service;

import com.example.airportmanagementsystem.model.binding.AirplaneBindingModel;
import com.example.airportmanagementsystem.model.entity.Airline;
import com.example.airportmanagementsystem.model.entity.Airplane;

public interface AirplaneService {

    Airplane createAirplane(Airline airline , AirplaneBindingModel airplaneBindingModel);

    Airplane findByARN(String airplaneARN);

    Airplane updateAirplane(AirplaneBindingModel airplaneBindingModel);

    void deleteAirplane(String ARN);
}
