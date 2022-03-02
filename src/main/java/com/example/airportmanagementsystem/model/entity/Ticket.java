package com.example.airportmanagementsystem.model.entity;

import com.example.airportmanagementsystem.model.entity.enums.TicketStatus;

import javax.persistence.*;

@Entity
@Table(name = "tickets")
public class Ticket extends BaseEntity {

    private Flight flight;
    private String seat;
    private Integer countSuitcases;
    private TicketStatus status;

    public Ticket() {
    }

    @ManyToOne
    public Flight getFlight() {
        return flight;
    }

    public Ticket setFlight(Flight flight) {
        this.flight = flight;
        return this;
    }

    @Column(nullable = false)
    public String getSeat() {
        return seat;
    }

    public Ticket setSeat(String seat) {
        this.seat = seat;
        return this;
    }

    @Column(nullable = false)
    public Integer getCountSuitcases() {
        return countSuitcases;
    }

    public Ticket setCountSuitcases(Integer countSuitcases) {
        this.countSuitcases = countSuitcases;
        return this;
    }

    @Enumerated(EnumType.STRING)
    public TicketStatus getStatus() {
        return status;
    }

    public Ticket setStatus(TicketStatus status) {
        this.status = status;
        return this;
    }
}
