package com.example.airportmanagementsystem.service.impl;

import com.example.airportmanagementsystem.model.binding.AddRouteBindingModel;
import com.example.airportmanagementsystem.model.binding.AirlineBindingModel;
import com.example.airportmanagementsystem.model.binding.AirplaneBindingModel;
import com.example.airportmanagementsystem.model.entity.Airline;
import com.example.airportmanagementsystem.model.entity.Airplane;
import com.example.airportmanagementsystem.model.entity.Route;
import com.example.airportmanagementsystem.repository.AirlineRepo;
import com.example.airportmanagementsystem.service.AirlineService;
import com.example.airportmanagementsystem.service.AirplaneService;
import com.example.airportmanagementsystem.service.FlightService;
import com.example.airportmanagementsystem.service.RouteService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;


@Service
public class AirlineServiceImpl implements AirlineService {

    private final AirlineRepo airlineRepo;
    private final AirplaneService airplaneService;
    private final RouteService routeService;
    private final FlightService flightService;

    public AirlineServiceImpl(AirlineRepo airlineRepo, AirplaneService airplaneService, RouteService routeService, FlightService flightService) {
        this.airlineRepo = airlineRepo;
        this.airplaneService = airplaneService;
        this.routeService = routeService;
        this.flightService = flightService;
    }

    @Override
    public Airline createAirline(AirlineBindingModel airlineBindingModel) {

        if (uniqueName(airlineBindingModel.getName())) {
            throw new IllegalArgumentException("We have airline with this " + airlineBindingModel.getName() + " name!");
        }

        if (uniqueIATA(airlineBindingModel.getIataCode())) {
            throw new IllegalArgumentException("We have airline with this " + airlineBindingModel.getIataCode() + " IATA code!");
        }
        if (uniqueICAO(airlineBindingModel.getIcaoCode())) {
            throw new IllegalArgumentException("We have airline with this " + airlineBindingModel.getIcaoCode() + " ICAO code!");
        }

        Airline airline = new Airline()
                .setName(airlineBindingModel.getName())
                .setWebsite(airlineBindingModel.getWebsite())
                .setIataCode(airlineBindingModel.getIataCode())
                .setIcaoCode(airlineBindingModel.getIcaoCode())
                .setPhone(airlineBindingModel.getPhone())
                .setEmail(airlineBindingModel.getEmail())
                .setImageUrl(airlineBindingModel.getImgUrl())
                .setDescription(airlineBindingModel.getDescription());

        return airlineRepo.save(airline);
    }

    @Override
    public Airline findByIataCode(String iataCode) {
        return airlineRepo
                .findAirlineByIataCode(iataCode)
                .orElseThrow(() -> new IllegalArgumentException("We don't have airline with this " + iataCode + " IATA code!"));
    }

    @Override
    public Airline updateAirline(AirlineBindingModel airlineBindingModel) {
        Airline airline = findByIataCode(airlineBindingModel.getIataCode());

        airline
                .setPhone(airlineBindingModel.getPhone())
                .setEmail(airlineBindingModel.getEmail())
                .setWebsite(airlineBindingModel.getWebsite())
                .setDescription(airlineBindingModel.getDescription())
                .setImageUrl(airlineBindingModel.getImgUrl());

        return airlineRepo.save(airline);//maybe it's good to come back dto object
    }

    @Override
    public void deleteAirline(String iataCode) {
        Airline airline = findByIataCode(iataCode);
        airlineRepo.delete(airline);
    }

    @Override
    public void createRoute(AddRouteBindingModel addRouteBindingModel) {
        Airline airline = findByIataCode(addRouteBindingModel.getAirlineIataCode());

        Route route = routeService.createRoute(airline , addRouteBindingModel);

        airline.getRoutes().add(route);
        //check save data
    }

    @Override
    public void addAirplane(AirplaneBindingModel airplaneBindingModel) {
        Airline airline = airlineRepo
                .findAirlineByName(airplaneBindingModel.getAirlineName())
                .orElseThrow(() -> new IllegalArgumentException("We don't have airline with this " + airplaneBindingModel.getAirlineName() + " airline name!"));

        Airplane airplane = airplaneService.createAirplane(airline, airplaneBindingModel);
        airline.getAirplanes().add(airplane);
    }

    private boolean uniqueICAO(String icaoCode) {
        return airlineRepo.findAirlineByIcaoCode(icaoCode).isPresent();
    }

    private boolean uniqueIATA(String iataCode) {
        return airlineRepo.findAirlineByIataCode(iataCode).isPresent();
    }

    private boolean uniqueName(String name) {
        return airlineRepo.findAirlineByName(name).isPresent();
    }


}
