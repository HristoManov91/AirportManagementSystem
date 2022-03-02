package com.example.airportmanagementsystem.repository;

import com.example.airportmanagementsystem.model.entity.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightRepo extends JpaRepository<Flight , Long> {
}
