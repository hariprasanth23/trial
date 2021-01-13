package com.example.trial.dao;

import com.example.trial.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.UUID;

public interface PaymentDao extends JpaRepository<Payment, UUID> {
    Payment findByPaymentDateAfter(Date date);
}
