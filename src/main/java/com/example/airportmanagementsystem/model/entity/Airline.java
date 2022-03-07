package com.example.airportmanagementsystem.model.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "airlines")
public class Airline extends BaseEntity {

    private String name;
    private String website;
    private String iataCode;
    private String icaoCode;
    private String phone;
    private String email;
    private String imageUrl;
    private List<Flight> flights = new ArrayList<>();
    private List<Airplane> airplanes = new ArrayList<>();
    private List<Route> routes = new ArrayList<>();
    private String description;
    // destinations

    public Airline() {
    }

    @Column(nullable = false , unique = true)
    public String getName() {
        return name;
    }

    public Airline setName(String name) {
        this.name = name;
        return this;
    }

    @Column
    public String getWebsite() {
        return website;
    }

    public Airline setWebsite(String website) {
        this.website = website;
        return this;
    }

    @Column(nullable = false , unique = true)
    public String getIataCode() {
        return iataCode;
    }

    public Airline setIataCode(String code) {
        this.iataCode = code;
        return this;
    }

    @Column(nullable = false , unique = true)
    public String getIcaoCode() {
        return icaoCode;
    }

    public Airline setIcaoCode(String icaoCode) {
        this.icaoCode = icaoCode;
        return this;
    }

    @Column(nullable = false)
    public String getPhone() {
        return phone;
    }

    public Airline setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    @Column
    public String getEmail() {
        return email;
    }

    public Airline setEmail(String email) {
        this.email = email;
        return this;
    }

    @Column(columnDefinition = "TEXT" , nullable = false)
    public String getImageUrl() {
        return imageUrl;
    }

    public Airline setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    @ManyToMany
    public List<Flight> getFlights() {
        return flights;
    }

    public Airline setFlights(List<Flight> flights) {
        this.flights = flights;
        return this;
    }

    @OneToMany(mappedBy = "airline", fetch = FetchType.EAGER)
    public List<Airplane> getAirplanes() {
        return airplanes;
    }

    public Airline setAirplanes(List<Airplane> airplanes) {
        this.airplanes = airplanes;
        return this;
    }

    @OneToMany
    public List<Route> getRoutes() {
        return routes;
    }

    public Airline setRoutes(List<Route> routes) {
        this.routes = routes;
        return this;
    }

    @Column
    public String getDescription() {
        return description;
    }

    public Airline setDescription(String description) {
        this.description = description;
        return this;
    }
}
