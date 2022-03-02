package com.example.airportmanagementsystem.service.impl;

import com.example.airportmanagementsystem.model.binding.CreateAirplaneBindingModel;
import com.example.airportmanagementsystem.model.entity.Airplane;
import com.example.airportmanagementsystem.model.entity.enums.AirplaneStatusEnum;
import com.example.airportmanagementsystem.repository.AirplaneRepo;
import com.example.airportmanagementsystem.service.AirplaneService;
import com.example.airportmanagementsystem.service.SeatService;
import org.springframework.stereotype.Service;

@Service
public class AirplaneServiceImpl implements AirplaneService {

    private final AirplaneRepo airplaneRepo;
    private final SeatService seatService;

    public AirplaneServiceImpl(AirplaneRepo airplaneRepo, SeatService seatService) {
        this.airplaneRepo = airplaneRepo;
        this.seatService = seatService;
    }

    @Override
    public Airplane createAirplane(CreateAirplaneBindingModel createAirplaneBindingModel) {
        Airplane airplane = new Airplane()
                .setManufacture(createAirplaneBindingModel.getManufacture())
                .setModel(createAirplaneBindingModel.getModel())
                .setARN(createAirplaneBindingModel.getARN())
                .setDateOfManufacture(createAirplaneBindingModel.getDateOfManufacture())
                .setCockpitCrew(createAirplaneBindingModel.getCockpitCrew())
                .setMaxTakeoffWeight(createAirplaneBindingModel.getMaxTakeoffWeightInKilograms())
                .setFuelCapacity(createAirplaneBindingModel.getFuelCapacityInLitres())
                .setFuelConsumption(createAirplaneBindingModel.getFuelConsumptionInLitres())
                .setMaxSpeed(createAirplaneBindingModel.getMaxSpeedInKilometres())
                .setTypicalRange(createAirplaneBindingModel.getTypicalRangeInKilometres())
                .setStatus(AirplaneStatusEnum.READY)
                .setSeats(seatService.createSeats(createAirplaneBindingModel.getCountOfSeats()));

        return airplaneRepo.save(airplane);
    }
}
