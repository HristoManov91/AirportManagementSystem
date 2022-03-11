package com.example.airportmanagementsystem.model.entity;

import javax.persistence.*;

@Entity
@Table(name = "passengers")
public class Passenger extends BaseEntity {

    private Ticket ticket;
    private Passport passport;
    private String description;

    public Passenger() {
    }

    @OneToOne(cascade = CascadeType.ALL)
    public Passport getPassport() {
        return passport;
    }

    public Passenger setPassport(Passport passport) {
        this.passport = passport;
        return this;
    }

    @OneToOne
    public Ticket getTicket() {
        return ticket;
    }

    public Passenger setTicket(Ticket ticket) {
        this.ticket = ticket;
        return this;
    }

    @Column
    public String getDescription() {
        return description;
    }

    public Passenger setDescription(String description) {
        this.description = description;
        return this;
    }
}
