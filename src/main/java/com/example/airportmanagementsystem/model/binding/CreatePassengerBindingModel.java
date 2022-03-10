package com.example.airportmanagementsystem.model.binding;

import com.example.airportmanagementsystem.model.entity.enums.GenderEnum;
import com.example.airportmanagementsystem.model.entity.enums.NationalityEnum;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.*;
import java.time.LocalDate;

public class CreatePassengerBindingModel {

    private String documentType;
    private String ownerFullName;
    private String gender;
    private String docNumber;
    private LocalDate expiration;
    private LocalDate birthday;
    private String nationality;

    public CreatePassengerBindingModel() {
    }

    @NotBlank
    public String getDocumentType() {
        return documentType;
    }

    public CreatePassengerBindingModel setDocumentType(String documentType) {
        this.documentType = documentType;
        return this;
    }

    @NotBlank
    public String getOwnerFullName() {
        return ownerFullName;
    }

    public CreatePassengerBindingModel setOwnerFullName(String ownerFullName) {
        this.ownerFullName = ownerFullName;
        return this;
    }

    @NotBlank
    public String getGender() {
        return gender;
    }

    public CreatePassengerBindingModel setGender(String gender) {
        this.gender = gender;
        return this;
    }

    @NotBlank
    public String getDocNumber() {
        return docNumber;
    }

    public CreatePassengerBindingModel setDocNumber(String docNumber) {
        this.docNumber = docNumber;
        return this;
    }

    @NotNull
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Future
    public LocalDate getExpiration() {
        return expiration;
    }

    public CreatePassengerBindingModel setExpiration(LocalDate expiration) {
        this.expiration = expiration;
        return this;
    }

    @NotNull
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @PastOrPresent
    public LocalDate getBirthday() {
        return birthday;
    }

    public CreatePassengerBindingModel setBirthday(LocalDate birthday) {
        this.birthday = birthday;
        return this;
    }

    @NotBlank
    public String getNationality() {
        return nationality;
    }

    public CreatePassengerBindingModel setNationality(String nationality) {
        this.nationality = nationality;
        return this;
    }
}
