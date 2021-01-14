package com.example.trial.entity;

import org.hibernate.annotations.Type;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class Admin {

    @Id
    @Type(type = "uuid-char")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID adminId;

    private String aadminEmail;
    private String adminPhone;
    private String adminUsername;
    private String adminPassword;

    public Admin(){

    }

    public Admin(UUID adminId, String aadminEmail, String adminPhone, String adminUsername, String adminPassword) {
        this.adminId = adminId;
        this.aadminEmail = aadminEmail;
        this.adminPhone = adminPhone;
        this.adminUsername = adminUsername;
        this.adminPassword = adminPassword;
    }

    public UUID getAdminId() {
        return adminId;
    }

    public void setAdminId(UUID adminId) {
        this.adminId = adminId;
    }

    public String getAadminEmail() {
        return aadminEmail;
    }

    public void setAadminEmail(String aadminEmail) {
        this.aadminEmail = aadminEmail;
    }

    public String getAdminPhone() {
        return adminPhone;
    }

    public void setAdminPhone(String adminPhone) {
        this.adminPhone = adminPhone;
    }

    public String getAdminUsername() {
        return adminUsername;
    }

    public void setAdminUsername(String adminUsername) {
        this.adminUsername = adminUsername;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }
}
