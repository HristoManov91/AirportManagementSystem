package com.example.airportmanagementsystem.service.impl;

import com.example.airportmanagementsystem.repository.PassportRepo;
import com.example.airportmanagementsystem.service.PassportService;
import org.springframework.stereotype.Service;

@Service
public class PassportServiceImpl implements PassportService {

    private final PassportRepo passportRepo;

    public PassportServiceImpl(PassportRepo passportRepo) {
        this.passportRepo = passportRepo;
    }
}
