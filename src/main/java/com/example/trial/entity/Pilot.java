package com.example.trial.entity;

import org.hibernate.annotations.Type;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class Pilot {

    @Id
    @Type(type = "uuid-char")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID pilotId;

    private String fullName;

    private String phone;

    private String address;

    public Pilot(){

    }

    public Pilot(UUID pilotId, String fullName, String phone, String address) {
        this.pilotId = pilotId;
        this.fullName = fullName;
        this.phone = phone;
        this.address = address;
    }

    public UUID getPilotId() {
        return pilotId;
    }

    public void setPilotId(UUID pilotId) {
        this.pilotId = pilotId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
