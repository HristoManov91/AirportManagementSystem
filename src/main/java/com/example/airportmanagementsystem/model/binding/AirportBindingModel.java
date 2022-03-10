package com.example.airportmanagementsystem.model.binding;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class AirportBindingModel {

    private String name;
    private String city;
    private String country;
    private String iataCode;
    private String icaoCode;
    private String website;

    public AirportBindingModel() {
    }

    @NotBlank
    public String getName() {
        return name;
    }

    public AirportBindingModel setName(String name) {
        this.name = name;
        return this;
    }

    @NotBlank
    public String getCity() {
        return city;
    }

    public AirportBindingModel setCity(String city) {
        this.city = city;
        return this;
    }

    @NotBlank
    public String getCountry() {
        return country;
    }

    public AirportBindingModel setCountry(String country) {
        this.country = country;
        return this;
    }

    @NotBlank
    @Size(min = 3 , max = 3)
    public String getIataCode() {
        return iataCode;
    }

    public AirportBindingModel setIataCode(String iataCode) {
        this.iataCode = iataCode;
        return this;
    }

    @NotBlank
    @Size(min = 4 , max = 4)
    public String getIcaoCode() {
        return icaoCode;
    }

    public AirportBindingModel setIcaoCode(String icaoCode) {
        this.icaoCode = icaoCode;
        return this;
    }

    @NotBlank
    public String getWebsite() {
        return website;
    }

    public AirportBindingModel setWebsite(String website) {
        this.website = website;
        return this;
    }
}
