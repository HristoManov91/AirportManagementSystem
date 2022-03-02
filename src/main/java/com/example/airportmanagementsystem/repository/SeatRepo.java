package com.example.airportmanagementsystem.repository;

import com.example.airportmanagementsystem.model.entity.Seat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeatRepo extends JpaRepository<Seat , Long> {
}
