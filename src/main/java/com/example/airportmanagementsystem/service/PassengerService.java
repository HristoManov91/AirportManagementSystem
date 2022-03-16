package com.example.airportmanagementsystem.service;

import com.example.airportmanagementsystem.model.binding.CreatePassengerBindingModel;
import com.example.airportmanagementsystem.model.binding.UpdatePassengerBindingModel;
import com.example.airportmanagementsystem.model.entity.Passenger;
import com.example.airportmanagementsystem.model.entity.Passport;
import com.example.airportmanagementsystem.model.entity.Ticket;

public interface PassengerService {

    Passenger initPassenger(Ticket ticket , Passport passport , String description);

    Passenger createPassenger(CreatePassengerBindingModel createPassengerBindingModel);

    Passenger updatePassenger(UpdatePassengerBindingModel updatePassengerBindingModel);

    Passenger findPassengerByPassportDocNum(String docNum);

    void deletePassenger(String docNum);

    long count();
}
