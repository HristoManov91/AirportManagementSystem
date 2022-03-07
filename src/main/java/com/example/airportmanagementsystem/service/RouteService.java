package com.example.airportmanagementsystem.service;

import com.example.airportmanagementsystem.model.binding.AddRouteBindingModel;
import com.example.airportmanagementsystem.model.entity.Route;

public interface RouteService {

    Route createRoute(AddRouteBindingModel addRouteBindingModel);

    Route findByRouteNum(String routeNum);
}
