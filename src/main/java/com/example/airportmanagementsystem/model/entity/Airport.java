package com.example.airportmanagementsystem.model.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "airports")
public class Airport extends BaseEntity {

    private String name;
    private String city;
    private String country;
    private String website;
    private List<Flight> flights = new ArrayList<>();
    // terminals
    // tracks
    // capacity
    // allowed destinations
    // city information

    public Airport() {
    }

    @Column(nullable = false , unique = true)
    public String getName() {
        return name;
    }

    public Airport setName(String name) {
        this.name = name;
        return this;
    }

    @Column(nullable = false)
    public String getCity() {
        return city;
    }

    public Airport setCity(String city) {
        this.city = city;
        return this;
    }

    @Column(nullable = false)
    public String getCountry() {
        return country;
    }

    public Airport setCountry(String country) {
        this.country = country;
        return this;
    }

    @Column(unique = true)
    public String getWebsite() {
        return website;
    }

    public Airport setWebsite(String website) {
        this.website = website;
        return this;
    }

    @OneToMany // better connection
    public List<Flight> getFlights() {
        return flights;
    }

    public Airport setFlights(List<Flight> flights) {
        this.flights = flights;
        return this;
    }
}
