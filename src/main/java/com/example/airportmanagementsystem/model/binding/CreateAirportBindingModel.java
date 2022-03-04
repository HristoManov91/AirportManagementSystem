package com.example.airportmanagementsystem.model.binding;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class CreateAirportBindingModel {

    private String name;
    private String city;
    private String country;
    private String iataCode;
    private String icaoCode;
    private String website;

    public CreateAirportBindingModel() {
    }

    @NotBlank
    public String getName() {
        return name;
    }

    public CreateAirportBindingModel setName(String name) {
        this.name = name;
        return this;
    }

    @NotBlank
    public String getCity() {
        return city;
    }

    public CreateAirportBindingModel setCity(String city) {
        this.city = city;
        return this;
    }

    @NotBlank
    public String getCountry() {
        return country;
    }

    public CreateAirportBindingModel setCountry(String country) {
        this.country = country;
        return this;
    }

    @NotBlank
    @Size(min = 3 , max = 3)
    public String getIataCode() {
        return iataCode;
    }

    public CreateAirportBindingModel setIataCode(String iataCode) {
        this.iataCode = iataCode;
        return this;
    }

    @NotBlank
    @Size(min = 4 , max = 4)
    public String getIcaoCode() {
        return icaoCode;
    }

    public CreateAirportBindingModel setIcaoCode(String icaoCode) {
        this.icaoCode = icaoCode;
        return this;
    }

    @NotBlank
    public String getWebsite() {
        return website;
    }

    public CreateAirportBindingModel setWebsite(String website) {
        this.website = website;
        return this;
    }
}
