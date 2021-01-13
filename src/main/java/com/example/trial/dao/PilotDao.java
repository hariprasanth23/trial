package com.example.trial.dao;

import com.example.trial.entity.Pilot;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PilotDao extends JpaRepository<Pilot, UUID> {
}
