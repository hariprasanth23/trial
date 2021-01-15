package com.example.trial.entity;

import org.hibernate.annotations.Type;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class User {

    @Id
    @Type(type = "uuid-char")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID userId;

    private String userName;
    private String password;
    private String authorizationRole;

    public User(){

    }

    public User(UUID userId, String userName, String password, String authorizationRole) {
        this.userId = userId;
        this.userName = userName;
        this.password = password;
        this.authorizationRole = authorizationRole;
    }

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAuthorizationRole() {
        return authorizationRole;
    }

    public void setAuthorizationRole(String authorizationRole) {
        this.authorizationRole = authorizationRole;
    }
}
