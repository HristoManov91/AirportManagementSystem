package com.example.airportmanagementsystem.service.impl;

import com.example.airportmanagementsystem.repository.PassengerRepo;
import com.example.airportmanagementsystem.service.PassengerService;
import org.springframework.stereotype.Service;

@Service
public class PassengerServiceImpl implements PassengerService {

    private final PassengerRepo passengerRepo;

    public PassengerServiceImpl(PassengerRepo passengerRepo) {
        this.passengerRepo = passengerRepo;
    }
}
