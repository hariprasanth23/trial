package com.example.trial.service;

import com.example.trial.dao.FlightDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlightService {

    @Autowired
    FlightDao flightDao;


}
