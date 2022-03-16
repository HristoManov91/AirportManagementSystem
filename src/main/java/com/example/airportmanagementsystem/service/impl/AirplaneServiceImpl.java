package com.example.airportmanagementsystem.service.impl;

import com.example.airportmanagementsystem.model.binding.AirplaneBindingModel;
import com.example.airportmanagementsystem.model.dto.AirplaneDto;
import com.example.airportmanagementsystem.model.entity.Airline;
import com.example.airportmanagementsystem.model.entity.Airplane;
import com.example.airportmanagementsystem.model.entity.enums.AirplaneStatusEnum;
import com.example.airportmanagementsystem.repository.AirplaneRepo;
import com.example.airportmanagementsystem.service.AirplaneService;
import com.example.airportmanagementsystem.service.SeatService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AirplaneServiceImpl implements AirplaneService {

    private final AirplaneRepo airplaneRepo;
    private final SeatService seatService;
    private final ModelMapper modelMapper;

    public AirplaneServiceImpl(AirplaneRepo airplaneRepo, SeatService seatService, ModelMapper modelMapper) {
        this.airplaneRepo = airplaneRepo;
        this.seatService = seatService;
        this.modelMapper = modelMapper;
    }

    @Override
    public void initSeatsForPlanes() {
        //i used this method because in data.sql need to add more 4000 rows
        if (seatService.count() == 0){
            airplaneRepo.save(airplaneRepo.findById(1L).orElseThrow().setSeats(seatService.createSeats(180)));
            airplaneRepo.save(airplaneRepo.findById(2L).orElseThrow().setSeats(seatService.createSeats(170)));
            airplaneRepo.save(airplaneRepo.findById(3L).orElseThrow().setSeats(seatService.createSeats(190)));
            airplaneRepo.save(airplaneRepo.findById(4L).orElseThrow().setSeats(seatService.createSeats(174)));
            airplaneRepo.save(airplaneRepo.findById(5L).orElseThrow().setSeats(seatService.createSeats(196)));
            airplaneRepo.save(airplaneRepo.findById(6L).orElseThrow().setSeats(seatService.createSeats(210)));
            airplaneRepo.save(airplaneRepo.findById(7L).orElseThrow().setSeats(seatService.createSeats(200)));
            airplaneRepo.save(airplaneRepo.findById(8L).orElseThrow().setSeats(seatService.createSeats(180)));
            airplaneRepo.save(airplaneRepo.findById(9L).orElseThrow().setSeats(seatService.createSeats(180)));
            airplaneRepo.save(airplaneRepo.findById(10L).orElseThrow().setSeats(seatService.createSeats(160)));
            airplaneRepo.save(airplaneRepo.findById(11L).orElseThrow().setSeats(seatService.createSeats(170)));
            airplaneRepo.save(airplaneRepo.findById(12L).orElseThrow().setSeats(seatService.createSeats(190)));
            airplaneRepo.save(airplaneRepo.findById(13L).orElseThrow().setSeats(seatService.createSeats(180)));
            airplaneRepo.save(airplaneRepo.findById(14L).orElseThrow().setSeats(seatService.createSeats(200)));
            airplaneRepo.save(airplaneRepo.findById(15L).orElseThrow().setSeats(seatService.createSeats(210)));
            airplaneRepo.save(airplaneRepo.findById(16L).orElseThrow().setSeats(seatService.createSeats(220)));
            airplaneRepo.save(airplaneRepo.findById(17L).orElseThrow().setSeats(seatService.createSeats(230)));
        }
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

    @Override
    public void deleteAirplane(Long id) {
        Airplane airplane = airplaneRepo.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("We don't have airplane with this " + id + " id!"));

        airplaneRepo.delete(airplane);
    }

    @Override
    public List<AirplaneDto> getAllAirplanes() {

        //.findAll not a good option for a lot of data (need to Pageable)
        return airplaneRepo.findAll().stream().map(this::asAirplane).collect(Collectors.toList());
    }

    @Override
    public AirplaneDto getAirplaneById(Long id) {
        Airplane airplane = airplaneRepo.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("We don't have airplane with this " + id + " id!"));

        return asAirplane(airplane);
    }

    private AirplaneDto asAirplane(Airplane airplane){

        return new AirplaneDto()
                .setId(airplane.getId())
                .setManufacture(airplane.getManufacture())
                .setModel(airplane.getModel())
                .setARN(airplane.getARN())
                .setAirline(airplane.getAirline().getName())
                .setDateOfManufacture(airplane.getDateOfManufacture())
                .setCockpitCrew(airplane.getCockpitCrew())
                .setCountOfSeats(airplane.getSeats().size())
                .setMaxTakeoffWeight(airplane.getMaxTakeoffWeight())
                .setFuelCapacity((airplane.getFuelCapacity()))
                .setFuelConsumption(airplane.getFuelConsumption())
                .setMaxSpeed(airplane.getMaxSpeed())
                .setTypicalRange(airplane.getTypicalRange())
                .setAirport(airplane.getAirport().getName())
                .setDescription(airplane.getDescription())
                .setStatus(airplane.getStatus());
    }

    private boolean uniqueARN(String arn) {
        return airplaneRepo.findByARN(arn).isPresent();
    }
}
