package com.example.trial.entity;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
public class Booking {

    @Id
    @Type(type = "uuid-char")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID bookingId;

    @Temporal(TemporalType.DATE)
    private Date journeyDate;

    @Temporal(TemporalType.DATE)
    private Date bookingDate;

    @OneToOne
    private AirlineRoutes airlineRoutes;

    @OneToOne(fetch = FetchType.EAGER)
    private Passenger passenger;

    @OneToOne(cascade= {
            CascadeType.PERSIST,CascadeType.MERGE,
            CascadeType.DETACH,CascadeType.REFRESH
    })
    private Payment payment;

    @Column
    private String bookingStatus;

    public Booking(){

    }

    public Booking(UUID bookingId, Date journeyDate, Date bookingDate, AirlineRoutes airlineRoutes, Passenger passenger, Payment payment, String bookingStatus) {
        this.bookingId = bookingId;
        this.journeyDate = journeyDate;
        this.bookingDate = bookingDate;
        this.airlineRoutes = airlineRoutes;
        this.passenger = passenger;
        this.payment = payment;
        this.bookingStatus = bookingStatus;
    }

    public UUID getBookingId() {
        return bookingId;
    }

    public void setBookingId(UUID bookingId) {
        this.bookingId = bookingId;
    }

    public Date getJourneyDate() {
        return journeyDate;
    }

    public void setJourneyDate(Date journeyDate) {
        this.journeyDate = journeyDate;
    }

    public Date getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(Date bookingDate) {
        this.bookingDate = bookingDate;
    }

    public AirlineRoutes getAirlineRoutes() {
        return airlineRoutes;
    }

    public void setAirlineRoutes(AirlineRoutes airlineRoutes) {
        this.airlineRoutes = airlineRoutes;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public String getBookingStatus() {
        return bookingStatus;
    }

    public void setBookingStatus(String bookingStatus) {
        this.bookingStatus = bookingStatus;
    }
}
