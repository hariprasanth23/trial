package com.example.trial.entity;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table
public class Passenger {

    @Id
    @Type(type = "uuid-char")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID passengerId;

    private String passengerName;

    private String passengerEmail;

    private String passengerPhone;

    private int passengerAge;

    private String passengerPassword;

    private String passengerGender;

    public Passenger(UUID passengerId, String passengerName, String passengerEmail, String passengerPhone, int passengerAge, String passengerPassword, String passengerGender) {
        this.passengerId = passengerId;
        this.passengerName = passengerName;
        this.passengerEmail = passengerEmail;
        this.passengerPhone = passengerPhone;
        this.passengerAge = passengerAge;
        this.passengerPassword = passengerPassword;
        this.passengerGender = passengerGender;
    }

    public Passenger() {

    }

    public UUID getPassengerId() {
        return passengerId;
    }

    public void setPassengerId(UUID passengerId) {
        this.passengerId = passengerId;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public String getPassengerEmail() {
        return passengerEmail;
    }

    public void setPassengerEmail(String passengerEmail) {
        this.passengerEmail = passengerEmail;
    }

    public String getPassengerGender() {
        return passengerGender;
    }

    public void setPassengerGender(String passengerGender) {
        this.passengerGender = passengerGender;
    }

    public String getPassengerPhone() {
        return passengerPhone;
    }

    public void setPassengerPhone(String passengerPhone) {
        this.passengerPhone = passengerPhone;
    }

    public int getPassengerAge() {
        return passengerAge;
    }

    public void setAge(int passengerAge) {
        this.passengerAge = passengerAge;
    }

    public void setPassengerAge(int passengerAge) {
        this.passengerAge = passengerAge;
    }

    public String getPassengerPassword() {
        return passengerPassword;
    }

    public void setPassengerPassword(String passengerPassword) {
        this.passengerPassword = passengerPassword;
    }
}
