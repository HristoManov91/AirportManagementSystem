package com.example.airportmanagementsystem.model.dto;

import com.example.airportmanagementsystem.model.entity.Airline;
import com.example.airportmanagementsystem.model.entity.Airport;

public class RouteDto {

    private Long id;
    private String routeNum;
    private String fromAirport;
    private String toAirport;
    private String airline;
    private Boolean status;


    public RouteDto() {
    }

    public Long getId() {
        return id;
    }

    public RouteDto setId(Long id) {
        this.id = id;
        return this;
    }

    public String getRouteNum() {
        return routeNum;
    }

    public RouteDto setRouteNum(String routeNum) {
        this.routeNum = routeNum;
        return this;
    }

    public String getFromAirport() {
        return fromAirport;
    }

    public RouteDto setFromAirport(String fromAirport) {
        this.fromAirport = fromAirport;
        return this;
    }

    public String getToAirport() {
        return toAirport;
    }

    public RouteDto setToAirport(String toAirport) {
        this.toAirport = toAirport;
        return this;
    }

    public String getAirline() {
        return airline;
    }

    public RouteDto setAirline(String airline) {
        this.airline = airline;
        return this;
    }

    public Boolean getStatus() {
        return status;
    }

    public RouteDto setStatus(Boolean status) {
        this.status = status;
        return this;
    }
}
