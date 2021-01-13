package com.example.trial.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Entity
public class Passport {

    @Id
    @Type(type = "uuid-char")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID passportId;

    private String passportNumber;

    private String expiryDate;

    private String fatherName;

    private String motherName;

    private String address;

    private String gender;

    @Temporal(TemporalType.DATE)
    private Date dateOfBirth;

    @OneToOne(fetch = FetchType.EAGER)
    private Passenger passenger;

    @OneToMany(mappedBy="passport",cascade= {
            CascadeType.PERSIST,CascadeType.MERGE,
            CascadeType.DETACH,CascadeType.REFRESH
    })
    @JsonManagedReference
    private List<Visa> visa;

    public Passport(){

    }

    public Passport(UUID passportId, String passportNumber, String expiryDate, String fatherName, String motherName, String address, String gender, Date dateOfBirth, Passenger passenger, List<Visa> visa) {
        this.passportId = passportId;
        this.passportNumber = passportNumber;
        this.expiryDate = expiryDate;
        this.fatherName = fatherName;
        this.motherName = motherName;
        this.address = address;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.passenger = passenger;
        this.visa = visa;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public UUID getPassportId() {
        return passportId;
    }

    public void setPassportId(UUID passportId) {
        this.passportId = passportId;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public List<Visa> getVisa() {
        return visa;
    }

    public void setVisa(List<Visa> visa) {
        this.visa = visa;
    }
}
