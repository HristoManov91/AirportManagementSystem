package com.example.airportmanagementsystem.web;

import com.example.airportmanagementsystem.service.AirlineService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/airlines")
public class AirlineRestController {

    private final AirlineService airlineService;

    public AirlineRestController(AirlineService airlineService) {
        this.airlineService = airlineService;
    }

//    @GetMapping("/")
//    public ResponseEntity<List<AirlineBindingModel>> getAllAirlines(){
////        List<AirlineBindingModel> airlines = airlineService.getAllAirlines();
//    }
}
