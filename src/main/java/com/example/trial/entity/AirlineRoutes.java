package com.example.trial.entity;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
public class AirlineRoutes {

    @Id
    @Type(type = "uuid-char")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID airlineRouteId;

    @OneToOne(cascade = {CascadeType.PERSIST,CascadeType.MERGE,
            CascadeType.DETACH,CascadeType.REFRESH})
    private Location from;

    @OneToOne(cascade = {CascadeType.PERSIST,CascadeType.MERGE,
            CascadeType.DETACH,CascadeType.REFRESH})
    private Location to;

    private double fare;

    private Boolean activeStatus;

    @OneToOne(cascade = CascadeType.PERSIST)
    private Flight flight;

    @Temporal(TemporalType.TIME)
    private Date journeyTime;

    @Temporal(TemporalType.TIME)
    private Date departureTime;

    @OneToOne
    private Admin admin;

    public AirlineRoutes(){

    }

    public AirlineRoutes(Location from, Location to, double fare, Boolean activeStatus, Flight flight, Date journeyTime, Date departureTime) {
        this.from = from;
        this.to = to;
        this.fare = fare;
        this.activeStatus = activeStatus;
        this.flight = flight;
        this.journeyTime = journeyTime;
        this.departureTime = departureTime;
    }

    public UUID getAirlineRouteId() {
        return airlineRouteId;
    }

    public void setAirlineRouteId(UUID airlineRouteId) {
        this.airlineRouteId = airlineRouteId;
    }

    public Location getFrom() {
        return from;
    }

    public void setFrom(Location from) {
        this.from = from;
    }

    public Location getTo() {
        return to;
    }

    public void setTo(Location to) {
        this.to = to;
    }

    public double getFare() {
        return fare;
    }

    public void setFare(double fare) {
        this.fare = fare;
    }

    public Boolean getActiveStatus() {
        return activeStatus;
    }

    public void setActiveStatus(Boolean activeStatus) {
        this.activeStatus = activeStatus;
    }

    public Date getJourneyTime() {
        return journeyTime;
    }

    public void setJourneyTime(Date journeyTime) {
        this.journeyTime = journeyTime;
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }


}
