package com.example.airportmanagementsystem.service.impl;

import com.example.airportmanagementsystem.model.binding.AddFlightBindingModel;
import com.example.airportmanagementsystem.model.binding.CreateAirportBindingModel;
import com.example.airportmanagementsystem.model.entity.Airplane;
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

//    @Override
//    public void initAirports() {
//        Airport sofia = new Airport().setName("Sofia Airport").setCity("Sofia").setWebsite("https://sofia-airport.eu/");
//        airportRepo.save(sofia);
//
//        Airport madrid = new Airport().setName("MADRID-BARAJAS AIRPORT").setCity("Madrid").setWebsite("https://www.aeropuertomadrid-barajas.com/");
//        airportRepo.save(madrid);
//
//        Airport bucharest = new Airport().setName("Bucharest Henri Coanda").setCity("Bucharest").setWebsite("https://www.bucharestairports.ro/en");
//        airportRepo.save(bucharest);
//
//        Airport rome = new Airport().setName("Aeroporto di Roma Fiumicino Leonardo da Vinci").setCity("Rome").setWebsite("https://www.adr.it/fiumicino");
//        airportRepo.save(rome);
//
//        Airport paris = new Airport().setName("Paris Aeroport").setCity("Paris").setWebsite("https://www.parisaeroport.fr/en");
//        airportRepo.save(paris);
//
//        Airport athens = new Airport().setName("ATHENS INTERNATIONAL AIRPORT").setCity("Athens").setWebsite("https://aia.gr/traveler/");
//        airportRepo.save(athens);
//
//        Airport munich = new Airport().setName("Munich Airport").setCity("Munich").setWebsite("https://www.munich-airport.com/");
//        airportRepo.save(munich);
//    }
//
//    @Override
//    public Airport createAirport(CreateAirportBindingModel createAirportBindingModel) {
//        Airport airport = new Airport()
//                .setName(createAirportBindingModel.getName())
//                .setCity(createAirportBindingModel.getCity())
//                .setWebsite(createAirportBindingModel.getWebsite());
//
//        return airportRepo.save(airport);
//    }
//
//    @Override
//    public String addFlight(AddFlightBindingModel addFlightBindingModel) {
//        Airport airport = airportRepo.findByName(addFlightBindingModel.getFromAirport())
//                .orElseThrow(() -> new IllegalArgumentException("There is no such airport"));
//
//    }
}
