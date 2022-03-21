package com.example.airportmanagementsystem.repository;

import com.example.airportmanagementsystem.model.entity.Airplane;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AirplaneRepo extends JpaRepository<Airplane , Long> {

    @Query("SELECT a FROM Airplane a LEFT JOIN FETCH a.seats WHERE a.id = ?1")
    Optional<Airplane> getAirplaneByIdWithFetch(Long id);

    Optional<Airplane> findByARN(String airplaneARN);
}
