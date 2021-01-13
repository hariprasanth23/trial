package com.example.trial.service;

import com.example.trial.dao.BookingDao;
import com.example.trial.entity.Passenger;
import com.example.trial.entity.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingService {

    @Autowired
    BookingDao bookingrepo;

    public List<Payment> uniquePassengerPayments(Passenger passenger){
        return bookingrepo.findByPassenger(passenger);
    }


}
