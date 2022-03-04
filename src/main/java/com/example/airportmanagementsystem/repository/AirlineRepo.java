package com.example.airportmanagementsystem.repository;

import com.example.airportmanagementsystem.model.entity.Airline;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AirlineRepo extends JpaRepository<Airline , Long> {

    Optional<Airline> findAirlineByName(String airlineName);

    Optional<Airline> findAirlineByIataCode(String iataCode);

    Optional<Airline> findAirlineByIcaoCode(String icaoCode);
}
