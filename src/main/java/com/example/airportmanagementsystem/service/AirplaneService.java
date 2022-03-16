package com.example.airportmanagementsystem.service;

import com.example.airportmanagementsystem.model.binding.AirplaneBindingModel;
import com.example.airportmanagementsystem.model.dto.AirplaneDto;
import com.example.airportmanagementsystem.model.entity.Airline;
import com.example.airportmanagementsystem.model.entity.Airplane;

import java.util.List;

public interface AirplaneService {

    Airplane createAirplane(Airline airline , AirplaneBindingModel airplaneBindingModel);

    Airplane findByARN(String airplaneARN);

    Airplane updateAirplane(AirplaneBindingModel airplaneBindingModel);

    void deleteAirplane(String ARN);

    void deleteAirplane(Long id);

    void initSeatsForPlanes();

    List<AirplaneDto> getAllAirplanes();

    AirplaneDto getAirplaneById(Long id);
}
