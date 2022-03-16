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
import com.example.airportmanagementsystem.service.RouteService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AirlineServiceImpl implements AirlineService {

    private final AirlineRepo airlineRepo;
    private final AirplaneService airplaneService;
    private final RouteService routeService;
    private final ModelMapper modelMapper;

    public AirlineServiceImpl(AirlineRepo airlineRepo, AirplaneService airplaneService, RouteService routeService, ModelMapper modelMapper) {
        this.airlineRepo = airlineRepo;
        this.airplaneService = airplaneService;
        this.routeService = routeService;
        this.modelMapper = modelMapper;
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
    public Airline findByName(String name) {

        return airlineRepo.findAirlineByName(name)
                .orElseThrow(() -> new IllegalArgumentException("We don't have airline with this " + name + " name!"));
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
    public List<AirlineBindingModel> getAllAirlines() {
        return null;
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
