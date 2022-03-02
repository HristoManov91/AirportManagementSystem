package com.example.airportmanagementsystem.repository;

import com.example.airportmanagementsystem.model.entity.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PassengerRepo extends JpaRepository<Passenger , Long> {
}
