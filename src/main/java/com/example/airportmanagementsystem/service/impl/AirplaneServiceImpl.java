package com.example.airportmanagementsystem.service.impl;

import com.example.airportmanagementsystem.model.binding.AirplaneBindingModel;
import com.example.airportmanagementsystem.model.entity.Airline;
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
    public Airplane createAirplane(Airline airline, AirplaneBindingModel airplaneBindingModel) {

        if (uniqueARN(airplaneBindingModel.getARN())) {
            throw new IllegalArgumentException("We have airplane with this " + airplaneBindingModel.getARN() + " ARN!");
        }

        Airplane airplane = new Airplane()
                .setManufacture(airplaneBindingModel.getManufacture())
                .setModel(airplaneBindingModel.getModel())
                .setARN(airplaneBindingModel.getARN())
                .setAirline(airline)
                .setDateOfManufacture(airplaneBindingModel.getDateOfManufacture())
                .setCockpitCrew(airplaneBindingModel.getCockpitCrew())
                .setMaxTakeoffWeight(airplaneBindingModel.getMaxTakeoffWeightInKilograms())
                .setFuelCapacity(airplaneBindingModel.getFuelCapacityInLitres())
                .setFuelConsumption(airplaneBindingModel.getFuelConsumptionInLitresPerHour())
                .setMaxSpeed(airplaneBindingModel.getMaxSpeedInKilometres())
                .setTypicalRange(airplaneBindingModel.getTypicalRangeInKilometres())
                .setStatus(AirplaneStatusEnum.READY)
                .setSeats(seatService.createSeats(airplaneBindingModel.getCountOfSeats()))
                .setDescription(airplaneBindingModel.getDescription());

        return airplaneRepo.save(airplane);
    }

    @Override
    public Airplane findByARN(String airplaneARN) {
        return airplaneRepo.findByARN(airplaneARN)
                .orElseThrow(() -> new IllegalArgumentException(airplaneARN));
    }

    @Override
    public Airplane updateAirplane(AirplaneBindingModel airplaneBindingModel) {
        Airplane airplane = findByARN(airplaneBindingModel.getARN());

        // there may be a situation where one company buys another plane it is necessary to write logic for that as well

        // if count of seats is different delete old and create new seats
        if (airplane.getSeats().size() != airplaneBindingModel.getCountOfSeats()){
            airplane.getSeats().forEach(s -> seatService.deleteSeat(s.getId()));
            airplane.setSeats(seatService.createSeats(airplaneBindingModel.getCountOfSeats()));
        }

        airplane
                .setCockpitCrew(airplane.getCockpitCrew())
                .setMaxTakeoffWeight(airplaneBindingModel.getMaxTakeoffWeightInKilograms())
                .setFuelCapacity(airplaneBindingModel.getFuelCapacityInLitres())
                .setFuelConsumption(airplaneBindingModel.getFuelConsumptionInLitresPerHour())
                .setMaxSpeed(airplaneBindingModel.getMaxSpeedInKilometres())
                .setTypicalRange(airplaneBindingModel.getTypicalRangeInKilometres())
                .setDescription(airplane.getDescription());

        return airplaneRepo.save(airplane);//maybe it's good to come back dto object
    }

    @Override
    public void deleteAirplane(String ARN) {
        Airplane airplane = findByARN(ARN);
        airplaneRepo.delete(airplane);
    }

    private boolean uniqueARN(String arn) {
        return airplaneRepo.findByARN(arn).isPresent();
    }
}
