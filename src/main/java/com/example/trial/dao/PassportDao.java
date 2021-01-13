package com.example.trial.dao;

import com.example.trial.entity.Passport;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PassportDao extends JpaRepository<Passport, UUID> {

}
