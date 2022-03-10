package com.example.airportmanagementsystem.repository;

import com.example.airportmanagementsystem.model.entity.Airport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AirportRepo extends JpaRepository<Airport , Long> {

    Optional<Airport> findByIataCode(String iataCode);

    Optional<Airport> findByIcaoCode(String icaoCode);

    Optional<Airport> findByName(String airportName);

    @Query("SELECT a FROM Airport a WHERE a.name = :name AND a.id <> :id")
    Optional<Airport> findByNameExceptId(String name , Long id);
}
