package com.example.trial.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface FlightDao extends JpaRepository<FlightDao, UUID> {
}
