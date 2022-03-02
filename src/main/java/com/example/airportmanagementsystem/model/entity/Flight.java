package com.example.airportmanagementsystem.model.entity;

import com.example.airportmanagementsystem.model.entity.enums.FlightStatusEnum;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.time.OffsetTime;

@Entity
@Table(name = "flights")
public class Flight extends BaseEntity {

    private Airport fromAirport;
    private LocalDateTime departure;
    private Airport toAirport;
    private LocalDateTime arrival;
    private Airplane airplane;
    private Boolean isFull;
    private FlightStatusEnum status;
    private OffsetTime boarding;
    private String flightDuration; // A time zone library can be used


    public Flight() {
    }

    @ManyToOne
    public Airport getFromAirport() {
        return fromAirport;
    }

    public Flight setFromAirport(Airport fromAirport) {
        this.fromAirport = fromAirport;
        return this;
    }

    @Column(nullable = false)
    public LocalDateTime getDeparture() {
        return departure;
    }

    public Flight setDeparture(LocalDateTime departure) {
        this.departure = departure;
        return this;
    }

    @ManyToOne
    public Airport getToAirport() {
        return toAirport;
    }

    public Flight setToAirport(Airport toAirport) {
        this.toAirport = toAirport;
        return this;
    }

    @Column(nullable = false)
    public LocalDateTime getArrival() {
        return arrival;
    }

    public Flight setArrival(LocalDateTime arrival) {
        this.arrival = arrival;
        return this;
    }

    @OneToOne
    public Airplane getAirplane() {
        return airplane;
    }

    public Flight setAirplane(Airplane airplane) {
        this.airplane = airplane;
        return this;
    }

    @Column(nullable = false)
    public Boolean getFull() {
        return isFull;
    }

    public Flight setFull(Boolean full) {
        isFull = full;
        return this;
    }

    @Column(nullable = false)
    public String getFlightDuration() {
        return flightDuration;
    }

    public Flight setFlightDuration(String flightDuration) {
        this.flightDuration = flightDuration;
        return this;
    }

    @Column(nullable = false)
    public OffsetTime getBoarding() {
        return boarding;
    }

    public Flight setBoarding(OffsetTime boarding) {
        this.boarding = boarding;
        return this;
    }

    @Enumerated(EnumType.STRING)
    public FlightStatusEnum getStatus() {
        return status;
    }

    public Flight setStatus(FlightStatusEnum status) {
        this.status = status;
        return this;
    }
}
