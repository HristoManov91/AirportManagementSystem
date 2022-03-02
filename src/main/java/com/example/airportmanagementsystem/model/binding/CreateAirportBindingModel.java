package com.example.airportmanagementsystem.model.binding;

import javax.validation.constraints.NotBlank;

public class CreateAirportBindingModel {

    private String name;
    private String city;
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
    public String getWebsite() {
        return website;
    }

    public CreateAirportBindingModel setWebsite(String website) {
        this.website = website;
        return this;
    }
}
