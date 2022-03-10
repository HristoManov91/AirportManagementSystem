package com.example.airportmanagementsystem.model.binding;

import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.*;
import java.math.BigDecimal;
import java.time.LocalDate;

public class AirplaneBindingModel {

    private String manufacture;
    private String model;
    private String ARN;
    private String airlineName;
    private String airport;
    private LocalDate dateOfManufacture;
    private Integer cockpitCrew;
    private Integer countOfSeats;
    private BigDecimal maxTakeoffWeightInKilograms;
    private BigDecimal fuelCapacityInLitres;
    private BigDecimal fuelConsumptionInLitresPerHour;
    private BigDecimal maxSpeedInKilometres;
    private BigDecimal typicalRangeInKilometres;
    private String description;

    public AirplaneBindingModel() {
    }

    @NotBlank
    @Size(min = 3 , max = 20)
    public String getManufacture() {
        return manufacture;
    }

    public AirplaneBindingModel setManufacture(String manufacture) {
        this.manufacture = manufacture;
        return this;
    }

    @NotBlank
    @Size(min = 3 , max = 20)
    public String getModel() {
        return model;
    }

    public AirplaneBindingModel setModel(String model) {
        this.model = model;
        return this;
    }

    @NotBlank
    @Size(min = 3 , max = 10)
    public String getARN() {
        return ARN;
    }

    public AirplaneBindingModel setARN(String ARN) {
        this.ARN = ARN;
        return this;
    }

    @NotBlank
    public String getAirlineName() {
        return airlineName;
    }

    public AirplaneBindingModel setAirlineName(String airlineName) {
        this.airlineName = airlineName;
        return this;
    }

    @NotBlank
    public String getAirport() {
        return airport;
    }

    public AirplaneBindingModel setAirport(String airport) {
        this.airport = airport;
        return this;
    }

    @NotNull
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @PastOrPresent
    public LocalDate getDateOfManufacture() {
        return dateOfManufacture;
    }

    public AirplaneBindingModel setDateOfManufacture(LocalDate dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
        return this;
    }

    @NotNull
    @Min(1)
    public Integer getCockpitCrew() {
        return cockpitCrew;
    }

    public AirplaneBindingModel setCockpitCrew(Integer cockpitCrew) {
        this.cockpitCrew = cockpitCrew;
        return this;
    }

    @NotNull
    @Min(10)
    public Integer getCountOfSeats() {
        return countOfSeats;
    }

    public AirplaneBindingModel setCountOfSeats(Integer countOfSeats) {
        this.countOfSeats = countOfSeats;
        return this;
    }

    @NotNull
    @Min(5000)
    public BigDecimal getMaxTakeoffWeightInKilograms() {
        return maxTakeoffWeightInKilograms;
    }

    public AirplaneBindingModel setMaxTakeoffWeightInKilograms(BigDecimal maxTakeoffWeightInKilograms) {
        this.maxTakeoffWeightInKilograms = maxTakeoffWeightInKilograms;
        return this;
    }

    @NotNull
    @Min(1000)
    public BigDecimal getFuelCapacityInLitres() {
        return fuelCapacityInLitres;
    }

    public AirplaneBindingModel setFuelCapacityInLitres(BigDecimal fuelCapacityInLitres) {
        this.fuelCapacityInLitres = fuelCapacityInLitres;
        return this;
    }

    @NotNull
    @Min(50)
    public BigDecimal getFuelConsumptionInLitresPerHour() {
        return fuelConsumptionInLitresPerHour;
    }

    public AirplaneBindingModel setFuelConsumptionInLitresPerHour(BigDecimal fuelConsumptionInLitres) {
        this.fuelConsumptionInLitresPerHour = fuelConsumptionInLitres;
        return this;
    }

    @NotNull
    @Min(1000)
    public BigDecimal getMaxSpeedInKilometres() {
        return maxSpeedInKilometres;
    }

    public AirplaneBindingModel setMaxSpeedInKilometres(BigDecimal maxSpeedInKilometres) {
        this.maxSpeedInKilometres = maxSpeedInKilometres;
        return this;
    }

    @NotNull
    @Positive
    public BigDecimal getTypicalRangeInKilometres() {
        return typicalRangeInKilometres;
    }

    public AirplaneBindingModel setTypicalRangeInKilometres(BigDecimal typicalRangeInKilometres) {
        this.typicalRangeInKilometres = typicalRangeInKilometres;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public AirplaneBindingModel setDescription(String description) {
        this.description = description;
        return this;
    }
}
