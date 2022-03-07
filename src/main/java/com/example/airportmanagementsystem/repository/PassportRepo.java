package com.example.airportmanagementsystem.repository;

import com.example.airportmanagementsystem.model.entity.Passport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PassportRepo extends JpaRepository<Passport , Long> {
}
