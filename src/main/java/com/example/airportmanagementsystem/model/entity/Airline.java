package com.example.airportmanagementsystem.model.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "airlines")
public class Airline extends BaseEntity {

    private String name;
    private String website;
    private String code;
    private String phone;
    private String email;
    private String imageUrl;
    private List<Airplane> airplanes;
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
    public String getCode() {
        return code;
    }

    public Airline setCode(String code) {
        this.code = code;
        return this;
    }

    @Column(nullable = false , unique = true)
    public String getPhone() {
        return phone;
    }

    public Airline setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    @Column(unique = true)
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

    @OneToMany(mappedBy = "airline" , fetch = FetchType.EAGER)
    public List<Airplane> getAirplanes() {
        return airplanes;
    }

    public Airline setAirplanes(List<Airplane> airplanes) {
        this.airplanes = airplanes;
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
