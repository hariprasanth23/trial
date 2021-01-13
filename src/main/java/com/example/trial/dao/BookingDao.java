package com.example.trial.dao;

import com.example.trial.entity.Booking;
import com.example.trial.entity.Passenger;
import com.example.trial.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface BookingDao extends JpaRepository<Booking, UUID> {

    List<Payment> findByPassenger(Passenger passenger);

}
