package com.example.trial.entity;

import org.hibernate.annotations.Type;

import javax.persistence.*;

@Entity
public class Feedback {

    @Id
    @Type(type ="uuid-char")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int feedbackId;

    @Column
    private String comment;

    @OneToOne
    private Passenger passenger;

    public Feedback(){

    }
    public Feedback(int feedbackId, String comment, Passenger passenger) {
        this.feedbackId = feedbackId;
        this.comment = comment;
        this.passenger = passenger;
    }

    public int getFeedbackId() {
        return feedbackId;
    }

    public void setFeedbackId(int feedbackId) {
        this.feedbackId = feedbackId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }
}
