package com.example.trial.service;

import com.example.trial.dao.AirlineRoutesDao;
import com.example.trial.entity.AirlineRoutes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AirlineRoutesService {

    @Autowired
    AirlineRoutesDao airlineRoutesDaoRepo;

    public List<AirlineRoutes> getRoutes(String locationFrom, String locationTo){
        return airlineRoutesDaoRepo.findByFromAndTo(locationFrom,locationTo);
    }

    public AirlineRoutes changeStatusOfAirlineRoutes(AirlineRoutes airlineRoutes){
        airlineRoutes.setActiveStatus(!(airlineRoutes.getActiveStatus()));
        return airlineRoutesDaoRepo.findById(airlineRoutes.getAirlineRouteId()).orElse(null);
    }


}
