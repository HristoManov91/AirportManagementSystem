package com.example.airportmanagementsystem.model.binding;

import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.*;
import java.math.BigDecimal;
import java.time.LocalDate;

public class CreateAirplaneBindingModel {

    private Long id;
    private String manufacture;
    private String model;
    private String ARN;
    private LocalDate dateOfManufacture;
    private Integer cockpitCrew;
    private Integer countOfSeats;
    private BigDecimal maxTakeoffWeightInKilograms;
    private BigDecimal fuelCapacityInLitres;
    private BigDecimal fuelConsumptionInLitres;
    private BigDecimal maxSpeedInKilometres;
    private BigDecimal typicalRangeInKilometres;

    public CreateAirplaneBindingModel() {
    }

    public Long getId() {
        return id;
    }

    public CreateAirplaneBindingModel setId(Long id) {
        this.id = id;
        return this;
    }

    @NotBlank
    @Size(min = 3 , max = 20)
    public String getManufacture() {
        return manufacture;
    }

    public CreateAirplaneBindingModel setManufacture(String manufacture) {
        this.manufacture = manufacture;
        return this;
    }

    @NotBlank
    @Size(min = 3 , max = 20)
    public String getModel() {
        return model;
    }

    public CreateAirplaneBindingModel setModel(String model) {
        this.model = model;
        return this;
    }

    @NotBlank
    @Size(min = 3 , max = 10)
    public String getARN() {
        return ARN;
    }

    public CreateAirplaneBindingModel setARN(String ARN) {
        this.ARN = ARN;
        return this;
    }

    @NotNull
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @PastOrPresent
    public LocalDate getDateOfManufacture() {
        return dateOfManufacture;
    }

    public CreateAirplaneBindingModel setDateOfManufacture(LocalDate dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
        return this;
    }

    @NotNull
    @Min(1)
    public Integer getCockpitCrew() {
        return cockpitCrew;
    }

    public CreateAirplaneBindingModel setCockpitCrew(Integer cockpitCrew) {
        this.cockpitCrew = cockpitCrew;
        return this;
    }

    @NotNull
    @Min(10)
    public Integer getCountOfSeats() {
        return countOfSeats;
    }

    public CreateAirplaneBindingModel setCountOfSeats(Integer countOfSeats) {
        this.countOfSeats = countOfSeats;
        return this;
    }

    @NotNull
    @Min(5000)
    public BigDecimal getMaxTakeoffWeightInKilograms() {
        return maxTakeoffWeightInKilograms;
    }

    public CreateAirplaneBindingModel setMaxTakeoffWeightInKilograms(BigDecimal maxTakeoffWeightInKilograms) {
        this.maxTakeoffWeightInKilograms = maxTakeoffWeightInKilograms;
        return this;
    }

    @NotNull
    @Min(1000)
    public BigDecimal getFuelCapacityInLitres() {
        return fuelCapacityInLitres;
    }

    public CreateAirplaneBindingModel setFuelCapacityInLitres(BigDecimal fuelCapacityInLitres) {
        this.fuelCapacityInLitres = fuelCapacityInLitres;
        return this;
    }

    @NotNull
    @Min(50)
    public BigDecimal getFuelConsumptionInLitres() {
        return fuelConsumptionInLitres;
    }

    public CreateAirplaneBindingModel setFuelConsumptionInLitresPerHour(BigDecimal fuelConsumptionInLitres) {
        this.fuelConsumptionInLitres = fuelConsumptionInLitres;
        return this;
    }

    @NotNull
    @Min(1000)
    public BigDecimal getMaxSpeedInKilometres() {
        return maxSpeedInKilometres;
    }

    public CreateAirplaneBindingModel setMaxSpeedInKilometres(BigDecimal maxSpeedInKilometres) {
        this.maxSpeedInKilometres = maxSpeedInKilometres;
        return this;
    }

    @NotNull
    @Positive
    public BigDecimal getTypicalRangeInKilometres() {
        return typicalRangeInKilometres;
    }

    public CreateAirplaneBindingModel setTypicalRangeInKilometres(BigDecimal typicalRangeInKilometres) {
        this.typicalRangeInKilometres = typicalRangeInKilometres;
        return this;
    }
}
