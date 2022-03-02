package com.example.airportmanagementsystem.repository;

import com.example.airportmanagementsystem.model.entity.Airport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AirportRepo extends JpaRepository<Airport , Long> {
}
