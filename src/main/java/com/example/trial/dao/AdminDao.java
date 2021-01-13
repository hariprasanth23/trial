package com.example.trial.dao;

import com.example.trial.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

public interface AdminDao extends JpaRepository<Admin, UUID> {

}
