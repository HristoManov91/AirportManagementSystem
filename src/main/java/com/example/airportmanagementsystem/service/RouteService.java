package com.example.airportmanagementsystem.service;

import com.example.airportmanagementsystem.model.binding.AddRouteBindingModel;
import com.example.airportmanagementsystem.model.entity.Airline;
import com.example.airportmanagementsystem.model.entity.Route;

public interface RouteService {

    Route createRoute(Airline airline , AddRouteBindingModel addRouteBindingModel);

    Route findByRouteNum(String routeNum);

    // The information I found about the routes is that they are closed simply if necessary and then can be resumed,
    // so I made such a logic
    void updateRouteStatus(String status, String routeNum);

    void deleteRoute(String routeNum);
}
