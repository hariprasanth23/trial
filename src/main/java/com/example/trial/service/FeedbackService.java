package com.example.trial.service;

import com.example.trial.dao.FeedbackDao;
import com.example.trial.entity.Feedback;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeedbackService {

    @Autowired
    FeedbackDao feedbackRepo;

    public List<Feedback> getAllFeedbacks(){
        return feedbackRepo.findAll();
    }

    public Feedback saveFeedback(Feedback feedback){
        return feedbackRepo.save(feedback);
    }
}
