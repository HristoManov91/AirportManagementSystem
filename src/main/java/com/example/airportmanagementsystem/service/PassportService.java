package com.example.airportmanagementsystem.service;

import com.example.airportmanagementsystem.model.dto.CreatePassportDto;
import com.example.airportmanagementsystem.model.entity.Passport;
import com.example.airportmanagementsystem.model.entity.enums.GenderEnum;
import com.example.airportmanagementsystem.model.entity.enums.NationalityEnum;

import java.time.LocalDate;

public interface PassportService {

    boolean isExistWithDocNum(String docNumber);

    Passport createPassport(CreatePassportDto createPassportDto);
}
