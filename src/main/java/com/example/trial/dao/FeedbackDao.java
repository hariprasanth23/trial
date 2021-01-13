package com.example.trial.dao;

import com.example.trial.entity.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface FeedbackDao extends JpaRepository<Feedback, UUID> {
}
