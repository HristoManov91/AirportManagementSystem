package com.example.airportmanagementsystem.model.binding;

import javax.validation.constraints.Future;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetTime;

public class AddFlightBindingModel {

    private String fromAirport;
    private LocalDateTime departure;
    private String toAirport;
    private LocalDateTime arrival;
    private String airplaneARN;
    private OffsetTime boarding;
    private LocalTime flightDuration;

    public AddFlightBindingModel() {
    }

    @NotBlank
    public String getFromAirport() {
        return fromAirport;
    }

    public AddFlightBindingModel setFromAirport(String fromAirport) {
        this.fromAirport = fromAirport;
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

    @NotBlank
    public String getToAirport() {
        return toAirport;
    }

    public AddFlightBindingModel setToAirport(String toAirport) {
        this.toAirport = toAirport;
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
