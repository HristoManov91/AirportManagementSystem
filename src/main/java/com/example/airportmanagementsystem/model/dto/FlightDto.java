package com.example.airportmanagementsystem.model.dto;

import com.example.airportmanagementsystem.model.entity.Airplane;
import com.example.airportmanagementsystem.model.entity.Route;
import com.example.airportmanagementsystem.model.entity.enums.FlightStatusEnum;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class FlightDto {

    private Long id;
    private Route route;
    private LocalDateTime departure;
    private LocalDateTime arrival;
    private String airplane;
    private Boolean isFull;
    private FlightStatusEnum status;
    private LocalDateTime boarding;
    private LocalTime flightDuration;
}
