package com.example.airportmanagementsystem.model.binding;

import javax.validation.constraints.Future;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class AddFlightBindingModel {

    private String routeNum;
    private LocalDateTime departure;
    private LocalDateTime arrival;
    private String airplaneARN;
    private LocalDateTime boarding;
    private LocalTime flightDuration;

    public AddFlightBindingModel() {
    }

    @NotBlank
    public String getRouteNum() {
        return routeNum;
    }

    public AddFlightBindingModel setRouteNum(String routeNum) {
        this.routeNum = routeNum;
        return this;
    }

    @NotNull
    @Future
    public LocalDateTime getDeparture() {
        return departure;
    }

    public AddFlightBindingModel setDeparture(LocalDateTime departure) {
        this.departure = departure;
        return this;
    }

    @NotNull
    @Future
    public LocalDateTime getArrival() {
        return arrival;
    }

    public AddFlightBindingModel setArrival(LocalDateTime arrival) {
        this.arrival = arrival;
        return this;
    }

    @NotBlank
    public String getAirplaneARN() {
        return airplaneARN;
    }

    public AddFlightBindingModel setAirplaneARN(String airplaneARN) {
        this.airplaneARN = airplaneARN;
        return this;
    }

    @Future
    @NotNull
    public LocalDateTime getBoarding() {
        return boarding;
    }

    public AddFlightBindingModel setBoarding(LocalDateTime boarding) {
        this.boarding = boarding;
        return this;
    }

    @NotNull
    public LocalTime getFlightDuration() {
        return flightDuration;
    }

    public AddFlightBindingModel setFlightDuration(LocalTime flightDuration) {
        this.flightDuration = flightDuration;
        return this;
    }
}
