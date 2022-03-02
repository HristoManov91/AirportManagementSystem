package com.example.airportmanagementsystem.model.entity;

import com.example.airportmanagementsystem.model.entity.enums.GenderEnum;
import com.example.airportmanagementsystem.model.entity.enums.NationalityEnum;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "passports")
public class Passport extends BaseEntity {

    private String documentType;
    private String ownerFullName;
    private GenderEnum gender;
    private Integer docNumber;
    private LocalDate expiration;
    private LocalDate birthday;
    private NationalityEnum nationality;

    public Passport() {
    }

    @Column(nullable = false)
    public String getDocumentType() {
        return documentType;
    }

    public Passport setDocumentType(String documentType) {
        this.documentType = documentType;
        return this;
    }

    @Column(nullable = false)
    public String getOwnerFullName() {
        return ownerFullName;
    }

    public Passport setOwnerFullName(String ownerFullName) {
        this.ownerFullName = ownerFullName;
        return this;
    }

    @Enumerated(EnumType.STRING)
    public GenderEnum getGender() {
        return gender;
    }

    public Passport setGender(GenderEnum gender) {
        this.gender = gender;
        return this;
    }

    @Column(nullable = false , unique = true)
    public Integer getDocNumber() {
        return docNumber;
    }

    public Passport setDocNumber(Integer docNumber) {
        this.docNumber = docNumber;
        return this;
    }

    @Column(nullable = false)
    public LocalDate getExpiration() {
        return expiration;
    }

    public Passport setExpiration(LocalDate expiration) {
        this.expiration = expiration;
        return this;
    }

    @Column(nullable = false)
    public LocalDate getBirthday() {
        return birthday;
    }

    public Passport setBirthday(LocalDate birthday) {
        this.birthday = birthday;
        return this;
    }

    @Enumerated(EnumType.STRING)
    public NationalityEnum getNationality() {
        return nationality;
    }

    public Passport setNationality(NationalityEnum nationality) {
        this.nationality = nationality;
        return this;
    }
}
