package com.example.airportmanagementsystem.service.impl;

import com.example.airportmanagementsystem.model.binding.CreatePassengerBindingModel;
import com.example.airportmanagementsystem.model.binding.UpdatePassengerBindingModel;
import com.example.airportmanagementsystem.model.dto.CreatePassportDto;
import com.example.airportmanagementsystem.model.entity.Passenger;
import com.example.airportmanagementsystem.model.entity.Passport;
import com.example.airportmanagementsystem.model.entity.enums.GenderEnum;
import com.example.airportmanagementsystem.model.entity.enums.NationalityEnum;
import com.example.airportmanagementsystem.repository.PassengerRepo;
import com.example.airportmanagementsystem.service.PassengerService;
import com.example.airportmanagementsystem.service.PassportService;
import org.springframework.stereotype.Service;

import java.util.Locale;

@Service
public class PassengerServiceImpl implements PassengerService {

    private final PassengerRepo passengerRepo;
    private final PassportService passportService;

    public PassengerServiceImpl(PassengerRepo passengerRepo, PassportService passportService) {
        this.passengerRepo = passengerRepo;
        this.passportService = passportService;
    }

    @Override
    public Passenger createPassenger(CreatePassengerBindingModel createPassengerBindingModel) {
        Passport passport = passportService.createPassport(new CreatePassportDto()
                .setDocumentType(createPassengerBindingModel.getDocumentType())
                .setGender(GenderEnum.valueOf(createPassengerBindingModel.getGender().toUpperCase(Locale.ROOT)))
                .setDocNumber(createPassengerBindingModel.getDocNumber())
                .setExpiration(createPassengerBindingModel.getExpiration())
                .setBirthday(createPassengerBindingModel.getBirthday())
                .setNationality(NationalityEnum.valueOf(createPassengerBindingModel.getNationality().toUpperCase(Locale.ROOT))));

        Passenger passenger = new Passenger()
                .setPassport(passport)
                .setDescription(createPassengerBindingModel.getDescription());

        return passengerRepo.save(passenger);
    }

    @Override
    public Passenger updatePassenger(UpdatePassengerBindingModel updatePassengerBindingModel) {
        return null; //ToDo
    }

    @Override
    public Passenger findPassengerByPassportDocNum(String docNum) {
        return passengerRepo.findByPassport_DocNumber(docNum)
                .orElseThrow(() -> new IllegalArgumentException("We don't have a passenger with this " + docNum + " document number!"));
    }

    @Override
    public void deletePassenger(String docNum) {
        Passenger passenger = passengerRepo.findByPassport_DocNumber(docNum)
                .orElseThrow(() -> new IllegalArgumentException("We don't have a passenger with this " + docNum + " document number!"));

        passengerRepo.delete(passenger);
    }
}
