package com.example.airportmanagementsystem.model.entity;

import com.example.airportmanagementsystem.model.entity.enums.FlightStatusEnum;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetTime;

@Entity
@Table(name = "flights")
public class Flight extends BaseEntity {

    private Destination destination;
    private LocalDateTime departure;
    private LocalDateTime arrival;
    private Airplane airplane;
    private Boolean isFull;
    private FlightStatusEnum status;
    private OffsetTime boarding;
    private LocalTime flightDuration; // A time zone library can be used
    // distance (need library for this)


    public Flight() {
    }

    
    public Destination getDestination() {
        return destination;
    }

    public Flight setDestination(Destination destination) {
        this.destination = destination;
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

    @Column(nullable = false)
    public LocalDateTime getArrival() {
        return arrival;
    }

    public Flight setArrival(LocalDateTime arrival) {
        this.arrival = arrival;
        return this;
    }

    @ManyToOne
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
    public LocalTime getFlightDuration() {
        return flightDuration;
    }

    public Flight setFlightDuration(LocalTime flightDuration) {
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
