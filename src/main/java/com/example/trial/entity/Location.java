package com.example.trial.entity;

import org.hibernate.annotations.Type;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class Location {

    @Id
    @Type(type ="uuid-char")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID locationId;
    private String locationName;

    public Location(){

    }
    public Location(UUID locationId, String locationName) {
        this.locationId = locationId;
        this.locationName = locationName;
    }

    public UUID getLocationId() {
        return locationId;
    }

    public void setLocationId(UUID locationId) {
        this.locationId = locationId;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }
}
