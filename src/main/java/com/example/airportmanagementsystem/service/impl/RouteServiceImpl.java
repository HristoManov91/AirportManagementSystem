package com.example.airportmanagementsystem.service.impl;

import com.example.airportmanagementsystem.model.binding.AddRouteBindingModel;
import com.example.airportmanagementsystem.model.entity.Route;
import com.example.airportmanagementsystem.repository.RouteRepo;
import com.example.airportmanagementsystem.service.AirlineService;
import com.example.airportmanagementsystem.service.AirportService;
import com.example.airportmanagementsystem.service.RouteService;
import org.springframework.stereotype.Service;

@Service
public class RouteServiceImpl implements RouteService {

    private final RouteRepo routeRepo;
    private final AirportService airportService;
    private final AirlineService airlineService;

    public RouteServiceImpl(RouteRepo routeRepo, AirportService airportService, AirlineService airlineService) {
        this.routeRepo = routeRepo;
        this.airportService = airportService;
        this.airlineService = airlineService;
    }

    @Override
    public Route createRoute(AddRouteBindingModel addRouteBindingModel) {
        Route route = new Route()
                .setRouteNum(addRouteBindingModel.getRouteNum())
                .setAirline(airlineService.findByIataCode(addRouteBindingModel.getAirlineIataCode()))
                .setFromAirport(airportService.findByIataCode(addRouteBindingModel.getFromAirportIataCode()))
                .setToAirport(airportService.findByIataCode(addRouteBindingModel.getToAirportIataCode()));

        return routeRepo.save(route);
    }

    @Override
    public Route findByRouteNum(String routeNum) {
        return routeRepo
                .findByRouteNum(routeNum)
                .orElseThrow(() -> new IllegalArgumentException("We don't have route with this " + routeNum + " number!"));
    }
}
