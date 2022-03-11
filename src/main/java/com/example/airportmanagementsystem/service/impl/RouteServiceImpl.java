package com.example.airportmanagementsystem.service.impl;

import com.example.airportmanagementsystem.model.binding.AddRouteBindingModel;
import com.example.airportmanagementsystem.model.entity.Airline;
import com.example.airportmanagementsystem.model.entity.Route;
import com.example.airportmanagementsystem.repository.RouteRepo;
import com.example.airportmanagementsystem.service.AirportService;
import com.example.airportmanagementsystem.service.RouteService;
import org.springframework.stereotype.Service;

@Service
public class RouteServiceImpl implements RouteService {

    private final RouteRepo routeRepo;
    private final AirportService airportService;

    public RouteServiceImpl(RouteRepo routeRepo, AirportService airportService) {
        this.routeRepo = routeRepo;
        this.airportService = airportService;
    }

    @Override
    public Route createRoute(Airline airline , AddRouteBindingModel addRouteBindingModel) {
        Route route = new Route()
                .setRouteNum(addRouteBindingModel.getRouteNum())
                .setAirline(airline)
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

    @Override
    public void updateRouteStatus(String status , String routeNum) {
        Route route = findByRouteNum(routeNum);
        if (status.equals("Active") && !route.getStatus()){
            route.setStatus(true);
        } else if (status.equals("Not active") && route.getStatus()){
            route.setStatus(false);
        }
    }

    @Override
    public void deleteRoute(String routeNum) {
        Route route = findByRouteNum(routeNum);

        routeRepo.delete(route);
    }
}
