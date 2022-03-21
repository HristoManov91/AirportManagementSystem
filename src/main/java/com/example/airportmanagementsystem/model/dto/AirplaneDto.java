package com.example.airportmanagementsystem.model.dto;

import com.example.airportmanagementsystem.model.entity.enums.AirplaneStatusEnum;

import java.math.BigDecimal;
import java.time.LocalDate;

public class AirplaneDto {

    private Long id;
    private String manufacture;
    private String model;
    private String ARN; //(Aircraft Registration Number);
    private String airline;
    private LocalDate dateOfManufacture;
    private Integer cockpitCrew;
    private Integer countOfSeats;
    private BigDecimal maxTakeoffWeight;
    private BigDecimal fuelCapacity;
    private BigDecimal fuelConsumption;
    private BigDecimal maxSpeed;
    private BigDecimal typicalRange;
    private String airport;
    private String description;
    private AirplaneStatusEnum status;

    public AirplaneDto() {
    }

    public Long getId() {
        return id;
    }

    public AirplaneDto setId(Long id) {
        this.id = id;
        return this;
    }

    public String getManufacture() {
        return manufacture;
    }

    public AirplaneDto setManufacture(String manufacture) {
        this.manufacture = manufacture;
        return this;
    }

    public String getModel() {
        return model;
    }

    public AirplaneDto setModel(String model) {
        this.model = model;
        return this;
    }

    public String getARN() {
        return ARN;
    }

    public AirplaneDto setARN(String ARN) {
        this.ARN = ARN;
        return this;
    }

    public String getAirline() {
        return airline;
    }

    public AirplaneDto setAirline(String airline) {
        this.airline = airline;
        return this;
    }

    public LocalDate getDateOfManufacture() {
        return dateOfManufacture;
    }

    public AirplaneDto setDateOfManufacture(LocalDate dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
        return this;
    }

    public Integer getCockpitCrew() {
        return cockpitCrew;
    }

    public AirplaneDto setCockpitCrew(Integer cockpitCrew) {
        this.cockpitCrew = cockpitCrew;
        return this;
    }

    public Integer getCountOfSeats() {
        return countOfSeats;
    }

    public AirplaneDto setCountOfSeats(Integer countOfSeats) {
        this.countOfSeats = countOfSeats;
        return this;
    }

    public BigDecimal getMaxTakeoffWeight() {
        return maxTakeoffWeight;
    }

    public AirplaneDto setMaxTakeoffWeight(BigDecimal maxTakeoffWeight) {
        this.maxTakeoffWeight = maxTakeoffWeight;
        return this;
    }

    public BigDecimal getFuelCapacity() {
        return fuelCapacity;
    }

    public AirplaneDto setFuelCapacity(BigDecimal fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
        return this;
    }

    public BigDecimal getFuelConsumption() {
        return fuelConsumption;
    }

    public AirplaneDto setFuelConsumption(BigDecimal fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
        return this;
    }

    public BigDecimal getMaxSpeed() {
        return maxSpeed;
    }

    public AirplaneDto setMaxSpeed(BigDecimal maxSpeed) {
        this.maxSpeed = maxSpeed;
        return this;
    }

    public BigDecimal getTypicalRange() {
        return typicalRange;
    }

    public AirplaneDto setTypicalRange(BigDecimal typicalRange) {
        this.typicalRange = typicalRange;
        return this;
    }

    public String getAirport() {
        return airport;
    }

    public AirplaneDto setAirport(String airport) {
        this.airport = airport;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public AirplaneDto setDescription(String description) {
        this.description = description;
        return this;
    }

    public AirplaneStatusEnum getStatus() {
        return status;
    }

    public AirplaneDto setStatus(AirplaneStatusEnum status) {
        this.status = status;
        return this;
    }
}
