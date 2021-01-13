package com.example.trial.dao;

import com.example.trial.entity.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

public interface PassengerDao extends JpaRepository<Passenger, UUID> {

  Passenger findByPassengerEmailAndAndPassengerPassword(String emailOrPhone,String password);

  Passenger findByPassengerPhoneAndAndPassengerPassword(String emailOrPhone, String password);

  Passenger findByPassengerEmail(String email);

  Passenger findByPassengerPhone(String phone);
}
