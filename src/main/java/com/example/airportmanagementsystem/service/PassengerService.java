package com.example.airportmanagementsystem.service;

import com.example.airportmanagementsystem.model.binding.CreatePassengerBindingModel;
import com.example.airportmanagementsystem.model.binding.UpdatePassengerBindingModel;
import com.example.airportmanagementsystem.model.entity.Passenger;

public interface PassengerService {

    Passenger createPassenger(CreatePassengerBindingModel createPassengerBindingModel);

    Passenger updatePassenger(UpdatePassengerBindingModel updatePassengerBindingModel);

    Passenger findPassengerByPassportDocNum(String docNum);

    void deletePassenger(String docNum);
}
