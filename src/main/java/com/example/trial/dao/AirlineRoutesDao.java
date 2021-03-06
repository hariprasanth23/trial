package com.example.trial.dao;

import com.example.trial.entity.AirlineRoutes;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface AirlineRoutesDao extends JpaRepository<AirlineRoutes, UUID> {

    List<AirlineRoutes> findByFromAndTo(String locationFrom, String locationTo);
}
