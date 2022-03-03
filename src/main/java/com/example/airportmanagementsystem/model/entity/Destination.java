package com.example.airportmanagementsystem.model.entity;

import javax.persistence.Column;
import javax.persistence.ManyToOne;

public class Destination {

    private Airport fromAirport;
    private Airport toAirport;
    private Airline airline;
    private String flightNo;

    public Destination() {
    }

    @ManyToOne
    public Airport getFromAirport() {
        return fromAirport;
    }

    public Destination setFromAirport(Airport fromAirport) {
        this.fromAirport = fromAirport;
        return this;
    }

    @ManyToOne
    public Airport getToAirport() {
        return toAirport;
    }

    public Destination setToAirport(Airport toAirport) {
        this.toAirport = toAirport;
        return this;
    }

    @ManyToOne
    public Airline getAirline() {
        return airline;
    }

    public Destination setAirline(Airline airline) {
        this.airline = airline;
        return this;
    }

    @Column(nullable = false , unique = true)
    public String getFlightNo() {
        return flightNo;
    }

    public Destination setFlightNo(String flightNo) {
        this.flightNo = flightNo;
        return this;
    }
}
