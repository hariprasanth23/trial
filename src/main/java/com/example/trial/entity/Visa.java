package com.example.trial.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
public class Visa {

    @Id
    @Type(type = "uuid-char")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID visaId;

    private String visaFrom;

    private String visaTo;

    private int noOfDays;

    private String visaStatus;

    private String reasonOfVisit;

    @Temporal(TemporalType.DATE)
    private Date visaAppliedDate;

    @ManyToOne(cascade= {
            CascadeType.PERSIST,CascadeType.MERGE,
            CascadeType.DETACH,CascadeType.REFRESH
    })
    @JsonBackReference
    private Passport passport;

    public Visa(){

    }

    public Visa(UUID visaId, String visaFrom, String visaTo, int noOfDays, String visaStatus, String reasonOfVisit, Date visaAppliedDate) {
        this.visaId = visaId;
        this.visaFrom = visaFrom;
        this.visaTo = visaTo;
        this.noOfDays = noOfDays;
        this.visaStatus = visaStatus;
        this.reasonOfVisit = reasonOfVisit;
        this.visaAppliedDate = visaAppliedDate;
    }

    public UUID getVisaId() {
        return visaId;
    }

    public void setVisaId(UUID visaId) {
        this.visaId = visaId;
    }

    public String getVisaFrom() {
        return visaFrom;
    }

    public void setVisaFrom(String visaFrom) {
        this.visaFrom = visaFrom;
    }

    public String getVisaTo() {
        return visaTo;
    }

    public void setVisaTo(String visaTo) {
        this.visaTo = visaTo;
    }

    public int getNoOfDays() {
        return noOfDays;
    }

    public void setNoOfDays(int noOfDays) {
        this.noOfDays = noOfDays;
    }

    public String getVisaStatus() {
        return visaStatus;
    }

    public void setVisaStatus(String visaStatus) {
        this.visaStatus = visaStatus;
    }

    public String getReasonOfVisit() {
        return reasonOfVisit;
    }

    public void setReasonOfVisit(String reasonOfVisit) {
        this.reasonOfVisit = reasonOfVisit;
    }

    public Date getVisaAppliedDate() {
        return visaAppliedDate;
    }

    public void setVisaAppliedDate(Date visaAppliedDate) {
        this.visaAppliedDate = visaAppliedDate;
    }
}
