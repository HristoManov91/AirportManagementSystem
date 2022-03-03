package com.example.airportmanagementsystem.service.impl;

import com.example.airportmanagementsystem.model.binding.AddFlightBindingModel;
import com.example.airportmanagementsystem.model.binding.CreateAirlineBindingModel;
import com.example.airportmanagementsystem.model.binding.CreateAirplaneBindingModel;
import com.example.airportmanagementsystem.model.entity.Airline;
import com.example.airportmanagementsystem.model.entity.Airplane;
import com.example.airportmanagementsystem.repository.AirlineRepo;
import com.example.airportmanagementsystem.service.AirlineService;
import com.example.airportmanagementsystem.service.AirplaneService;
import com.example.airportmanagementsystem.service.FlightService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;


@Service
public class AirlineServiceImpl implements AirlineService {

    private final AirlineRepo airlineRepo;
    private final AirplaneService airplaneService;
    private final FlightService flightService;

    public AirlineServiceImpl(AirlineRepo airlineRepo, AirplaneService airplaneService, FlightService flightService) {
        this.airlineRepo = airlineRepo;
        this.airplaneService = airplaneService;
        this.flightService = flightService;
    }

//    @Override
//    public void initAirline() {
//
//        // --------------------- Create Airline and add airplane -----------------------
//
//        Airline bulgariaAir = new Airline()
//                .setName("BULGARIA AIR")
//                .setCode("FB / LZB")
//                .setWebsite("https://www.air.bg/bg")
//                .setPhone("+363 2 945 90 27")
//                .setEmail("callfb@air.bg")
//                .setAirplanes(new ArrayList<>())
//                .setImageUrl("https://images.ctfassets.net/biom0eqyyi6b/1b8ztEoWXkaKkcuK2YmyuK/7edb43de24bf245749cf3c910a1802b1/BulgariaAir.png");
//
//        airlineRepo.save(bulgariaAir);
//        addAirplane("BULGARIA AIR",
//                new CreateAirplaneBindingModel()
//                        .setManufacture("Airbus")
//                        .setModel("a320")
//                        .setARN("BG1000")
//                        .setDateOfManufacture(LocalDate.of(2005, 8, 11))
//                        .setCockpitCrew(2)
//                        .setCountOfSeats(180)
//                        .setMaxTakeoffWeightInKilograms(BigDecimal.valueOf(75000))
//                        .setFuelCapacityInLitres(BigDecimal.valueOf(26730))
//                        .setFuelConsumptionInLitresPerHour(BigDecimal.valueOf(2700))
//                        .setMaxSpeedInKilometres(BigDecimal.valueOf(800))
//                        .setTypicalRangeInKilometres(BigDecimal.valueOf(6300)));
//
//        // --------------------- Create Airline and add airplane -----------------------
//
//        Airline lufthansa = new Airline()
//                .setName("DEUTSCHE LUFTHANSA AG")
//                .setCode("LH / DLH")
//                .setWebsite("https://www.lufthansa.com/bg/en/homepage")
//                .setPhone("+496986799799")
//                .setImageUrl("https://www.schengenvisainfo.com/news/wp-content/uploads/2021/03/lufthansa.jpg");
//
//        airlineRepo.save(lufthansa);
//        addAirplane("DEUTSCHE LUFTHANSA AG",
//                new CreateAirplaneBindingModel()
//                        .setManufacture("Airbus")
//                        .setModel("a321")
//                        .setARN("GE1000")
//                        .setDateOfManufacture(LocalDate.of(2006, 6, 21))
//                        .setCockpitCrew(3)
//                        .setCountOfSeats(190)
//                        .setMaxTakeoffWeightInKilograms(BigDecimal.valueOf(80000))
//                        .setFuelCapacityInLitres(BigDecimal.valueOf(27730))
//                        .setFuelConsumptionInLitresPerHour(BigDecimal.valueOf(2600))
//                        .setMaxSpeedInKilometres(BigDecimal.valueOf(850))
//                        .setTypicalRangeInKilometres(BigDecimal.valueOf(6800)));
//
//        // --------------------- Create Airline and add airplane -----------------------
//
//        Airline ryanair = new Airline()
//                .setName("RYANAIR")
//                .setCode("FR / RYR")
//                .setWebsite("https://www.ryanair.com/gb/en")
//                .setPhone("+44 871 246 0002")
//                .setEmail("customerqueries@ryanair.com")
//                .setImageUrl("https://wallpaperaccess.com/full/4456022.jpg");
//
//        airlineRepo.save(ryanair);
//        addAirplane("RYANAIR",
//                new CreateAirplaneBindingModel()
//                        .setManufacture("Airbus")
//                        .setModel("a319")
//                        .setARN("FE1000")
//                        .setDateOfManufacture(LocalDate.of(2009, 1, 25))
//                        .setCockpitCrew(2)
//                        .setCountOfSeats(170)
//                        .setMaxTakeoffWeightInKilograms(BigDecimal.valueOf(70100))
//                        .setFuelCapacityInLitres(BigDecimal.valueOf(25730))
//                        .setFuelConsumptionInLitresPerHour(BigDecimal.valueOf(2750))
//                        .setMaxSpeedInKilometres(BigDecimal.valueOf(750))
//                        .setTypicalRangeInKilometres(BigDecimal.valueOf(6000)));
//
//        // --------------------- Create Airline and add airplane -----------------------
//
//        Airline turkishAirlines = new Airline()
//                .setName("TURKISH AIRLINES")
//                .setCode("TK / THY")
//                .setWebsite("https://www.turkishairlines.com/")
//                .setPhone("0850 333 0 849")
//                .setImageUrl("https://i.hurimg.com/i/hdn/75/0x0/5d70f33267b0a92d5c67f6b9.jpg");
//
//        airlineRepo.save(turkishAirlines);
//        addAirplane("TURKISH AIRLINES",
//                new CreateAirplaneBindingModel()
//                        .setManufacture("Boeing")
//                        .setModel("737")
//                        .setARN("TU1000")
//                        .setDateOfManufacture(LocalDate.of(2003, 2, 12))
//                        .setCockpitCrew(2)
//                        .setCountOfSeats(160)
//                        .setMaxTakeoffWeightInKilograms(BigDecimal.valueOf(65100))
//                        .setFuelCapacityInLitres(BigDecimal.valueOf(28730))
//                        .setFuelConsumptionInLitresPerHour(BigDecimal.valueOf(2850))
//                        .setMaxSpeedInKilometres(BigDecimal.valueOf(830))
//                        .setTypicalRangeInKilometres(BigDecimal.valueOf(6900)));
//
//        // --------------------- Create Airline and add airplane -----------------------
//
//        Airline wizzAir = new Airline()
//                .setName("WIZZ AIR")
//                .setCode("W6 / WZZ")
//                .setWebsite("https://wizzair.com/")
//                .setPhone("+90 063 949")
//                .setImageUrl("https://www.fly4free.com/wp-content/uploads/2020/05/A321neo_WIZZ_AIR-800x537.jpg");
//
//        airlineRepo.save(wizzAir);
//        addAirplane("WIZZ AIR",
//                new CreateAirplaneBindingModel()
//                        .setManufacture("Boeing")
//                        .setModel("777")
//                        .setARN("WE1000")
//                        .setDateOfManufacture(LocalDate.of(2004, 4, 24))
//                        .setCockpitCrew(2)
//                        .setCountOfSeats(230)
//                        .setMaxTakeoffWeightInKilograms(BigDecimal.valueOf(95100))
//                        .setFuelCapacityInLitres(BigDecimal.valueOf(32730))
//                        .setFuelConsumptionInLitresPerHour(BigDecimal.valueOf(3050))
//                        .setMaxSpeedInKilometres(BigDecimal.valueOf(900))
//                        .setTypicalRangeInKilometres(BigDecimal.valueOf(7500)));
//
//        // --------------------- Create Airline and add airplane -----------------------
//
//        Airline qatarAirways = new Airline()
//                .setName("QATAR AIRWAYS")
//                .setCode("QR / QTR")
//                .setWebsite("https://www.qatarairways.com/en-bg/homepage.html")
//                .setPhone("+97 444 237 999")
//                .setEmail("qinfo@qatarairways.com.qa")
//                .setImageUrl("https://airlines-airports.com/wp-content/uploads/2019/01/Qatar-Airways-Interesting-Facts-1170x500.jpg");
//
//        airlineRepo.save(qatarAirways);
//        addAirplane("QATAR AIRWAYS",
//                new CreateAirplaneBindingModel()
//                        .setManufacture("Boeing")
//                        .setModel("777")
//                        .setARN("QA1000")
//                        .setDateOfManufacture(LocalDate.of(2008, 11, 10))
//                        .setCockpitCrew(3)
//                        .setCountOfSeats(250)
//                        .setMaxTakeoffWeightInKilograms(BigDecimal.valueOf(97100))
//                        .setFuelCapacityInLitres(BigDecimal.valueOf(33730))
//                        .setFuelConsumptionInLitresPerHour(BigDecimal.valueOf(2950))
//                        .setMaxSpeedInKilometres(BigDecimal.valueOf(910))
//                        .setTypicalRangeInKilometres(BigDecimal.valueOf(7800)));
//    }
//
//    @Override
//    public Airline createAirline(CreateAirlineBindingModel createAirlineBindingModel) {
//
//        Airline airline = new Airline()
//                .setName(createAirlineBindingModel.getName())
//                .setWebsite(createAirlineBindingModel.getWebsite())
//                .setCode(createAirlineBindingModel.getCode())
//                .setPhone(createAirlineBindingModel.getPhone())
//                .setEmail(createAirlineBindingModel.getEmail())
//                .setImageUrl(createAirlineBindingModel.getImgUrl())
//                .setDescription(createAirlineBindingModel.getDescription());
//
//        return airlineRepo.save(airline);
//    }
//
//    @Override
//    public void addAirplane(String airlineName, CreateAirplaneBindingModel createAirplaneBindingModel) {
//        Airline airline = airlineRepo
//                .findAirlineByName(airlineName)
//                .orElseThrow(() -> new IllegalArgumentException(airlineName));
//
//        airline.getAirplanes().add(airplaneService.createAirplane(createAirplaneBindingModel));
//    }




}
