package com.example.airportmanagementsystem.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "seats")
public class Seat extends BaseEntity {

    private String seat;
    private Boolean isBusy;
    // extras

    public Seat() {
    }

    @Column
    public String getSeat() {
        return seat;
    }

    public Seat setSeat(String seat) {
        this.seat = seat;
        return this;
    }

    @Column
    public Boolean getBusy() {
        return isBusy;
    }

    public Seat setBusy(Boolean busy) {
        isBusy = busy;
        return this;
    }
}
