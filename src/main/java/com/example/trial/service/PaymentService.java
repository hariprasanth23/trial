package com.example.trial.service;

import com.example.trial.dao.PaymentDao;
import com.example.trial.entity.Passenger;
import com.example.trial.entity.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class PaymentService {

    @Autowired
    PaymentDao paymentRepo;

    public Payment makePayment(Payment payment){
        return paymentRepo.save(payment);
    }

}
