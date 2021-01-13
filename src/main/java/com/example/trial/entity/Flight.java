package com.example.trial.entity;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.UUID;

@Entity
public class Flight {

    @Id
    @Type(type = "uuid-char")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID flightId;

    private String flightNumber;

    private String flightCapacity;

    @OneToOne(cascade = CascadeType.PERSIST)
    private Pilot pilot;

    public Flight(){

    }
    public Flight(UUID flightId, String flightNumber, String flightCapacity) {
        this.flightId = flightId;
        this.flightNumber = flightNumber;
        this.flightCapacity = flightCapacity;
    }

    public UUID getFlightId() {
        return flightId;
    }

    public void setFlightId(UUID flightId) {
        this.flightId = flightId;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getFlightCapacity() {
        return flightCapacity;
    }

    public void setFlightCapacity(String flightCapacity) {
        this.flightCapacity = flightCapacity;
    }
}
