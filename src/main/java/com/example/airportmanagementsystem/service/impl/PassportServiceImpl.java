package com.example.airportmanagementsystem.service.impl;

import com.example.airportmanagementsystem.model.dto.CreatePassportDto;
import com.example.airportmanagementsystem.model.entity.Passport;
import com.example.airportmanagementsystem.repository.PassportRepo;
import com.example.airportmanagementsystem.service.PassportService;
import org.springframework.stereotype.Service;

@Service
public class PassportServiceImpl implements PassportService {

    private final PassportRepo passportRepo;

    public PassportServiceImpl(PassportRepo passportRepo) {
        this.passportRepo = passportRepo;
    }

    @Override
    public Passport createPassport(CreatePassportDto createPassportDto) {
        boolean isExist = isExistWithDocNum(createPassportDto.getDocNumber());
        if (isExist) {
            throw new IllegalArgumentException("We have passenger with this " + createPassportDto.getDocNumber() + " document number");
        }

        Passport passport = new Passport()
                .setDocumentType(createPassportDto.getDocumentType())
                .setDocNumber(createPassportDto.getDocNumber())
                .setNationality(createPassportDto.getNationality())
                .setBirthday(createPassportDto.getBirthday())
                .setExpiration(createPassportDto.getExpiration())
                .setGender(createPassportDto.getGender())
                .setOwnerFullName(createPassportDto.getOwnerFullName());

        return passportRepo.save(passport);
    }

    @Override
    public Passport getById(long id) {
        return passportRepo.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("We don't have a passport with this " + id + " id!"));
    }

    @Override
    public boolean isExistWithDocNum(String docNumber) {
        return passportRepo.findByDocNumber(docNumber).isPresent();
    }
}
