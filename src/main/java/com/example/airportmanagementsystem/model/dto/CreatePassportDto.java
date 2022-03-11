package com.example.airportmanagementsystem.model.dto;

import com.example.airportmanagementsystem.model.entity.enums.GenderEnum;
import com.example.airportmanagementsystem.model.entity.enums.NationalityEnum;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.Future;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import java.time.LocalDate;

public class CreatePassportDto {

     private String documentType;
     private String ownerFullName;
     private GenderEnum gender;
     private String docNumber;
     private LocalDate expiration;
     private LocalDate birthday;
     private NationalityEnum nationality;

    public CreatePassportDto() {
    }

    @NotBlank
    public String getDocumentType() {
        return documentType;
    }

    public CreatePassportDto setDocumentType(String documentType) {
        this.documentType = documentType;
        return this;
    }

    @NotBlank
    public String getOwnerFullName() {
        return ownerFullName;
    }

    public CreatePassportDto setOwnerFullName(String ownerFullName) {
        this.ownerFullName = ownerFullName;
        return this;
    }

    @NotBlank
    public GenderEnum getGender() {
        return gender;
    }

    public CreatePassportDto setGender(GenderEnum gender) {
        this.gender = gender;
        return this;
    }

    @NotBlank
    public String getDocNumber() {
        return docNumber;
    }

    public CreatePassportDto setDocNumber(String docNumber) {
        this.docNumber = docNumber;
        return this;
    }

    @NotNull
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Future
    public LocalDate getExpiration() {
        return expiration;
    }

    public CreatePassportDto setExpiration(LocalDate expiration) {
        this.expiration = expiration;
        return this;
    }

    @NotNull
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @PastOrPresent
    public LocalDate getBirthday() {
        return birthday;
    }

    public CreatePassportDto setBirthday(LocalDate birthday) {
        this.birthday = birthday;
        return this;
    }

    @NotBlank
    public NationalityEnum getNationality() {
        return nationality;
    }

    public CreatePassportDto setNationality(NationalityEnum nationality) {
        this.nationality = nationality;
        return this;
    }
}
