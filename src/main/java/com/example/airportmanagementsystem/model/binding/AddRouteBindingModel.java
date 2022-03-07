package com.example.airportmanagementsystem.model.binding;

import javax.validation.constraints.NotBlank;

public class AddRouteBindingModel {

    private String routeNum;
    private String fromAirportIataCode;
    private String toAirportIataCode;
    private String airlineIataCode;

    public AddRouteBindingModel() {
    }

    @NotBlank
    public String getRouteNum() {
        return routeNum;
    }

    public AddRouteBindingModel setRouteNum(String routeNum) {
        this.routeNum = routeNum;
        return this;
    }

    @NotBlank
    public String getFromAirportIataCode() {
        return fromAirportIataCode;
    }

    public AddRouteBindingModel setFromAirportIataCode(String fromAirportIataCode) {
        this.fromAirportIataCode = fromAirportIataCode;
        return this;
    }

    @NotBlank
    public String getToAirportIataCode() {
        return toAirportIataCode;
    }

    public AddRouteBindingModel setToAirportIataCode(String toAirportIataCode) {
        this.toAirportIataCode = toAirportIataCode;
        return this;
    }

    @NotBlank
    public String getAirlineIataCode() {
        return airlineIataCode;
    }

    public AddRouteBindingModel setAirlineIataCode(String airlineIataCode) {
        this.airlineIataCode = airlineIataCode;
        return this;
    }
}
