package com.example.airportmanagementsystem.service;

import com.example.airportmanagementsystem.model.entity.Seat;

import java.util.List;

public interface SeatService {
    List<Seat> createSeats(Integer countOfSeats);

    void deleteSeat(Long id);
}
