package com.example.trial.dao;

import com.example.trial.entity.Visa;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface VisaDao extends JpaRepository<Visa, UUID> {

}
