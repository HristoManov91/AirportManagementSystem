package com.example.airportmanagementsystem.model.binding;

import javax.validation.constraints.Future;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetTime;

public class AddFlightBindingModel {

    private String flightNum;
    private LocalDateTime departure;
    private LocalDateTime arrival;
    private String airplaneARN;
    private OffsetTime boarding;
    private LocalTime flightDuration;

    public AddFlightBindingModel() {
    }

    @NotBlank
    public String getFlightNum() {
        return flightNum;
    }

    public AddFlightBindingModel setFlightNum(String flightNum) {
        this.flightNum = flightNum;
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
    public OffsetTime getBoarding() {
        return boarding;
    }

    public AddFlightBindingModel setBoarding(OffsetTime boarding) {
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
