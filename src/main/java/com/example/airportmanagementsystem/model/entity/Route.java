package com.example.airportmanagementsystem.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "routes")
public class Route extends BaseEntity {

    private String routeNum;
    private Airport fromAirport;
    private Airport toAirport;
    private Airline airline;
    private Boolean status;

    public Route() {
    }

    @Column(unique = true , nullable = false)
    public String getRouteNum() {
        return routeNum;
    }

    public Route setRouteNum(String flightNo) {
        this.routeNum = flightNo;
        return this;
    }

    @ManyToOne
    public Airport getFromAirport() {
        return fromAirport;
    }

    public Route setFromAirport(Airport fromAirport) {
        this.fromAirport = fromAirport;
        return this;
    }

    @ManyToOne
    public Airport getToAirport() {
        return toAirport;
    }

    public Route setToAirport(Airport toAirport) {
        this.toAirport = toAirport;
        return this;
    }

    @ManyToOne
    public Airline getAirline() {
        return airline;
    }

    public Route setAirline(Airline airline) {
        this.airline = airline;
        return this;
    }

    @Column
    public Boolean getStatus() {
        return status;
    }

    public Route setStatus(Boolean status) {
        this.status = status;
        return this;
    }
}
