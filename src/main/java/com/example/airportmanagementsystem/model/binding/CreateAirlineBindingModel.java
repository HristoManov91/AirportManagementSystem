package com.example.airportmanagementsystem.model.binding;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class CreateAirlineBindingModel {

    private String name;
    private String website;
    private String iataCode;
    private String icaoCode;
    private String phone;
    private String email;
    private String imgUrl;
    private String description;

    public CreateAirlineBindingModel() {
    }

    @NotBlank
    @Size(min = 3)
    public String getName() {
        return name;
    }

    public CreateAirlineBindingModel setName(String name) {
        this.name = name;
        return this;
    }

    @NotBlank
    @Size(min = 3)
    public String getWebsite() {
        return website;
    }

    public CreateAirlineBindingModel setWebsite(String website) {
        this.website = website;
        return this;
    }

    @NotBlank
    @Size(min = 2 , max = 2)
    public String getIataCode() {
        return iataCode;
    }

    public CreateAirlineBindingModel setIataCode(String iataCode) {
        this.iataCode = iataCode;
        return this;
    }

    @NotBlank
    @Size(min = 3 , max = 3)
    public String getIcaoCode() {
        return icaoCode;
    }

    public CreateAirlineBindingModel setIcaoCode(String icaoCode) {
        this.icaoCode = icaoCode;
        return this;
    }

    @NotBlank
    @Size(min = 3)
    public String getPhone() {
        return phone;
    }

    public CreateAirlineBindingModel setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    @Email
    @NotBlank
    public String getEmail() {
        return email;
    }

    public CreateAirlineBindingModel setEmail(String email) {
        this.email = email;
        return this;
    }

    @NotBlank
    public String getImgUrl() {
        return imgUrl;
    }

    public CreateAirlineBindingModel setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public CreateAirlineBindingModel setDescription(String description) {
        this.description = description;
        return this;
    }
}
