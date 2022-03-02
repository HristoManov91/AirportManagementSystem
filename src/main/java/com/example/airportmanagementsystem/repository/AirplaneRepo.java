package com.example.airportmanagementsystem.repository;

import com.example.airportmanagementsystem.model.entity.Airplane;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AirplaneRepo extends JpaRepository<Airplane , Long> {
}
