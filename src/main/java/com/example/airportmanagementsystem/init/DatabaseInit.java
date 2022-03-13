package com.example.airportmanagementsystem.init;

import com.example.airportmanagementsystem.service.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseInit implements CommandLineRunner {

    private final AirplaneService airplaneService;

    public DatabaseInit(AirplaneService airplaneService) {
        this.airplaneService = airplaneService;
    }

    @Override
    public void run(String... args) throws Exception {
        airplaneService.initSeatsForPlanes();
    }
}
