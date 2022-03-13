package com.example.airportmanagementsystem.service.impl;

import com.example.airportmanagementsystem.model.binding.AddFlightBindingModel;
import com.example.airportmanagementsystem.model.binding.AirportBindingModel;
import com.example.airportmanagementsystem.model.entity.Airport;
import com.example.airportmanagementsystem.repository.AirportRepo;
import com.example.airportmanagementsystem.service.AirportService;
import org.springframework.stereotype.Service;

@Service
public class AirportServiceImpl implements AirportService {

    private final AirportRepo airportRepo;

    public AirportServiceImpl(AirportRepo airportRepo) {
        this.airportRepo = airportRepo;
    }

    @Override
    public Airport createAirport(AirportBindingModel airportBindingModel) {
        // these checks can be done through an annotation created by us or at an early stage of the application
        if (uniqueName(airportBindingModel.getName())) {
            throw new IllegalArgumentException("We have airport with this " + airportBindingModel.getName() + " name!");
        }

        if (uniqueIATA(airportBindingModel.getIataCode())) {
            throw new IllegalArgumentException("We have airport with this " + airportBindingModel.getIataCode() + " IATA code!");
        }

        if (uniqueICAO(airportBindingModel.getIcaoCode())) {
            throw new IllegalArgumentException("We have airport with this " + airportBindingModel.getIcaoCode() + " ICAO code!");
        }

        Airport airport = new Airport()
                .setName(airportBindingModel.getName())
                .setCity(airportBindingModel.getCity())
                .setCountry(airportBindingModel.getCountry())
                .setIataCode(airportBindingModel.getIataCode())
                .setIcaoCode(airportBindingModel.getIcaoCode())
                .setWebsite(airportBindingModel.getWebsite());

        return airportRepo.save(airport);
    }

    @Override
    public Airport findByIataCode(String iataCode) {
        return airportRepo
                .findByIataCode(iataCode)
                .orElseThrow(() -> new IllegalArgumentException("We don't have airline with this " + iataCode + " IATA name!"));
    }

    @Override
    public Airport updateAirport(AirportBindingModel airportBindingModel) {
        Airport airport = findByIataCode(airportBindingModel.getIataCode());

        // this check is good to do in the controller
        if (!airport.getName().equals(airportBindingModel.getName())) {
            boolean present = airportRepo.findByNameExceptId(airport.getName(), airport.getId()).isPresent();
            if (present) {
                airport.setName(airport.getName());
            } else {
                throw new IllegalArgumentException("We have airport with this " + airportBindingModel.getName() + " name!");
            }
        }

        airport.setWebsite(airport.getWebsite());

        return airportRepo.save(airport);
    }

    @Override
    public void deleteAirport(String iataCode) {
        Airport airport = findByIataCode(iataCode);
        airportRepo.delete(airport);
    }

    @Override
    public String addFlight(AddFlightBindingModel addFlightBindingModel) {
//        Airport airport = airportRepo.findByIataCode(//Todo)
//                .orElseThrow(() -> new IllegalArgumentException("There is no such airport"));

        return null;
    }

    private boolean uniqueICAO(String icaoCode) {
        return airportRepo.findByIcaoCode(icaoCode).isPresent();
    }

    private boolean uniqueIATA(String iataCode) {
        return airportRepo.findByIataCode(iataCode).isPresent();
    }

    private boolean uniqueName(String airportName) {
        return airportRepo.findByName(airportName).isPresent();
    }
}
