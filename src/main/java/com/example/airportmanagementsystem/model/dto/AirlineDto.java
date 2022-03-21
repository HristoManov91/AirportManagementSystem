package com.example.airportmanagementsystem.model.dto;

import java.util.ArrayList;
import java.util.List;

public class AirlineDto {

    private Long id;
    private String name;
    private String website;
    private String iataCode;
    private String icaoCode;
    private String phone;
    private String email;
    private String imageUrl;
    private List<FlightDto> flights = new ArrayList<>();
    private Integer countOfAirplanes;
    private Integer countOfRoutes;
    private String description;
}
