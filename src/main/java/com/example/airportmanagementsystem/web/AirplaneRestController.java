package com.example.airportmanagementsystem.web;

import com.example.airportmanagementsystem.model.binding.AirplaneBindingModel;
import com.example.airportmanagementsystem.model.dto.AirplaneDto;
import com.example.airportmanagementsystem.model.entity.Airline;
import com.example.airportmanagementsystem.model.entity.Airplane;
import com.example.airportmanagementsystem.service.AirlineService;
import com.example.airportmanagementsystem.service.AirplaneService;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/airplanes")
public class AirplaneRestController {

    private final AirplaneService airplaneService;
    private final AirlineService airlineService;

    public AirplaneRestController(AirplaneService airplaneService, AirlineService airlineService) {
        this.airplaneService = airplaneService;
        this.airlineService = airlineService;
    }

    @Transactional
    @GetMapping()
    public ResponseEntity<List<AirplaneDto>> findAllAirplanes() {
        List<AirplaneDto> allAirplanes = airplaneService.getAllAirplanes();

        return ResponseEntity.ok(allAirplanes);
    }

    @GetMapping("/{id}")
    public ResponseEntity<AirplaneDto> findAirplaneDtoById(@PathVariable("id") Long id) {
        //if we make return Optional return ResponseEntity.notFound() and return error 404
        AirplaneDto airplaneById = airplaneService.getAirplaneById(id);

        return ResponseEntity.ok(airplaneById);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<AirplaneDto> deleteBook(@PathVariable("id") Long id) {
        airplaneService.deleteAirplane(id);

        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<AirplaneBindingModel> update(@RequestBody AirplaneBindingModel airplaneBindingModel,
                                                       UriComponentsBuilder builder){

        Airplane airplane = airplaneService.updateAirplane(airplaneBindingModel);

        URI location = builder.path("/airplane/{id}").buildAndExpand(airplane.getId()).toUri();

        return ResponseEntity.created(location).build();
    }

    @PostMapping()
    public ResponseEntity<AirplaneBindingModel> create(@RequestBody AirplaneBindingModel airplaneBindingModel ,
                                                       UriComponentsBuilder builder) {

        Airline airline = airlineService.findByName(airplaneBindingModel.getAirlineName());
        Airplane airplane = airplaneService.createAirplane(airline , airplaneBindingModel);

        URI location = builder.path("/airplane/{id}").buildAndExpand(airplane.getId()).toUri();

        return ResponseEntity.created(location).build();
    }
}
