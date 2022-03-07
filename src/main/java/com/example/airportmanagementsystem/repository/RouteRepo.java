package com.example.airportmanagementsystem.repository;

import com.example.airportmanagementsystem.model.entity.Route;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RouteRepo extends JpaRepository<Route , Long> {

    Optional<Route> findByRouteNum(String routeNum);
}
