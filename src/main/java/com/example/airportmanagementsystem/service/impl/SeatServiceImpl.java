package com.example.airportmanagementsystem.service.impl;

import com.example.airportmanagementsystem.model.entity.Seat;
import com.example.airportmanagementsystem.repository.SeatRepo;
import com.example.airportmanagementsystem.service.SeatService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SeatServiceImpl implements SeatService {

    private static final String[] SEAT_LEATHERS = new String[]{"A" , "B" , "C" , "D" , "E" , "F"};

    private final SeatRepo seatRepo;

    public SeatServiceImpl(SeatRepo seatRepo) {
        this.seatRepo = seatRepo;
    }

    @Override
    public List<Seat> createSeats(Integer countOfSeats) {
        List<Seat> seats = new ArrayList<>();

        int count = 1;
        int letterIndex = 0;
        int row = 1;

        while (count <= countOfSeats){
            Seat seat = new Seat()
                    .setSeat(row + SEAT_LEATHERS[letterIndex])
                    .setBusy(false);

            seats.add(seatRepo.save(seat));

            letterIndex++;
            count++;

            if (letterIndex >= SEAT_LEATHERS.length){
                letterIndex = 0;
                row++;
            }
        }

        return seats;
    }

    @Override
    public void deleteSeat(Long id) {
        seatRepo.deleteById(id);
    }

    @Override
    public Seat getSeatById(long id) {
        return seatRepo.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("We don't have seat with this " + id + " IATA name!"));
    }

    @Override
    public long count() {
        return seatRepo.count();
    }
}
