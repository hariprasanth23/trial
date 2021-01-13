package com.example.trial.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface LocationDao extends JpaRepository<LocationDao, UUID> {
}
