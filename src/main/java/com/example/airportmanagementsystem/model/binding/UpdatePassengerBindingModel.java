package com.example.airportmanagementsystem.model.binding;

import com.example.airportmanagementsystem.model.entity.enums.GenderEnum;
import com.example.airportmanagementsystem.model.entity.enums.NationalityEnum;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.Future;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import java.time.LocalDate;

public class UpdatePassengerBindingModel {

    private String ownerFullName;
    private String documentType;
    private String docNumber;
    private String gender;
    private LocalDate expiration;
    private LocalDate birthday;
    private String nationality;
    private String description;

    public UpdatePassengerBindingModel() {
    }

    @NotBlank
    public String getOwnerFullName() {
        return ownerFullName;
    }

    public UpdatePassengerBindingModel setOwnerFullName(String ownerFullName) {
        this.ownerFullName = ownerFullName;
        return this;
    }

    @NotBlank
    public String getDocumentType() {
        return documentType;
    }

    public UpdatePassengerBindingModel setDocumentType(String documentType) {
        this.documentType = documentType;
        return this;
    }

    @NotBlank
    public String getDocNumber() {
        return docNumber;
    }

    public UpdatePassengerBindingModel setDocNumber(String docNumber) {
        this.docNumber = docNumber;
        return this;
    }

    @NotBlank
    public String getGender() {
        return gender;
    }

    public UpdatePassengerBindingModel setGender(String gender) {
        this.gender = gender;
        return this;
    }

    @NotNull
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Future
    public LocalDate getExpiration() {
        return expiration;
    }

    public UpdatePassengerBindingModel setExpiration(LocalDate expiration) {
        this.expiration = expiration;
        return this;
    }

    @NotNull
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @PastOrPresent
    public LocalDate getBirthday() {
        return birthday;
    }

    public UpdatePassengerBindingModel setBirthday(LocalDate birthday) {
        this.birthday = birthday;
        return this;
    }

    @NotBlank
    public String getNationality() {
        return nationality;
    }

    public UpdatePassengerBindingModel setNationality(String nationality) {
        this.nationality = nationality;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public UpdatePassengerBindingModel setDescription(String description) {
        this.description = description;
        return this;
    }
}
