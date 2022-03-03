package com.example.airportmanagementsystem.model.entity;

import com.example.airportmanagementsystem.model.entity.enums.AirplaneStatusEnum;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "airplanes")
public class Airplane extends BaseEntity {

    private String manufacture;
    private String model;
    private String ARN; //(Aircraft Registration Number);
    private Airline airline;
    private LocalDate dateOfManufacture;
    private Integer cockpitCrew;
    private List<Seat> seats;
    private List<Flight> flights;
    private BigDecimal maxTakeoffWeight;
    private BigDecimal fuelCapacity;
    private BigDecimal fuelConsumption;
    private BigDecimal maxSpeed;
    private BigDecimal typicalRange;
    private Airport airport;
    private String description;
    private AirplaneStatusEnum status;
    // Children/babies capacity
    // Engines
    // Sizes
    // Extras


    public Airplane() {
    }

    @Column(nullable = false)
    public String getManufacture() {
        return manufacture;
    }

    public Airplane setManufacture(String manufacture) {
        this.manufacture = manufacture;
        return this;
    }

    @Column(length = 50 , nullable = false)
    public String getModel() {
        return model;
    }

    public Airplane setModel(String model) {
        this.model = model;
        return this;
    }

    @Column(length = 30 , nullable = false , unique = true)
    public String getARN() {
        return ARN;
    }

    public Airplane setARN(String ARN) {
        this.ARN = ARN;
        return this;
    }

    @ManyToOne
    public Airline getAirline() {
        return airline;
    }

    public Airplane setAirline(Airline airline) {
        this.airline = airline;
        return this;
    }

    @Column(name = "date_of_manufacture" , nullable = false)
    public LocalDate getDateOfManufacture() {
        return dateOfManufacture;
    }

    public Airplane setDateOfManufacture(LocalDate dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
        return this;
    }

    @Column(name = "cockpit_crew" , nullable = false)
    public Integer getCockpitCrew() {
        return cockpitCrew;
    }

    public Airplane setCockpitCrew(Integer cockpitCrew) {
        this.cockpitCrew = cockpitCrew;
        return this;
    }

    @OneToMany
    public List<Seat> getSeats() {
        return seats;
    }

    public Airplane setSeats(List<Seat> seats) {
        this.seats = seats;
        return this;
    }

    @OneToMany(mappedBy = "airplane")
    public List<Flight> getFlights() {
        return flights;
    }

    public Airplane setFlights(List<Flight> flights) {
        this.flights = flights;
        return this;
    }

    @Column(nullable = false)
    public BigDecimal getMaxTakeoffWeight() {
        return maxTakeoffWeight;
    }

    public Airplane setMaxTakeoffWeight(BigDecimal maxTakeoffWeight) {
        this.maxTakeoffWeight = maxTakeoffWeight;
        return this;
    }

    @Column(nullable = false)
    public BigDecimal getFuelCapacity() {
        return fuelCapacity;
    }

    public Airplane setFuelCapacity(BigDecimal fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
        return this;
    }

    @Column(nullable = false) // normally calculate by formula and depends on many parameters
    public BigDecimal getFuelConsumption() {
        return fuelConsumption;
    }

    public Airplane setFuelConsumption(BigDecimal fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
        return this;
    }

    @Column(nullable = false)
    public BigDecimal getMaxSpeed() {
        return maxSpeed;
    }

    public Airplane setMaxSpeed(BigDecimal maxSpeed) {
        this.maxSpeed = maxSpeed;
        return this;
    }

    @Column(nullable = false)
    public BigDecimal getTypicalRange() {
        return typicalRange;
    }

    public Airplane setTypicalRange(BigDecimal typicalRange) {
        this.typicalRange = typicalRange;
        return this;
    }

    @ManyToOne
    public Airport getAirport() {
        return airport;
    }

    public Airplane setAirport(Airport airport) {
        this.airport = airport;
        return this;
    }

    @Column(columnDefinition = "TEXT")
    public String getDescription() {
        return description;
    }

    public Airplane setDescription(String description) {
        this.description = description;
        return this;
    }

    @Enumerated(EnumType.STRING)
    public AirplaneStatusEnum getStatus() {
        return status;
    }

    public Airplane setStatus(AirplaneStatusEnum status) {
        this.status = status;
        return this;
    }
}
