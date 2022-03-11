package com.example.airportmanagementsystem.repository;

import com.example.airportmanagementsystem.model.entity.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PassengerRepo extends JpaRepository<Passenger , Long> {

    Optional<Passenger> findByPassport_DocNumber(String docNum);
}
