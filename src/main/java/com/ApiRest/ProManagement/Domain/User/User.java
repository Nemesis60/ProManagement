package com.ApiRest.ProManagement.Domain.User;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import java.util.Date;

@Entity
public class User {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String completeName;
    private String dadLastName;
    private String momLastName;
    private String email;
    private String phoneNumber;
    private Date created;

    // CONSTRUCTOR
    public User(Long id, String completeName, String dadLastName, String momLastName, String email, String phoneNumber, Date created) {
        this.id = id;
        this.completeName = completeName;
        this.dadLastName = dadLastName;
        this.momLastName = momLastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.created = created;
    }

    // GETTERS AND SETTERS
    public Long getId () {
        return this.id;
    }
    public void setId (Long id) {
        this.id = id;
    }

    //-----
    public String getCompleteName () {
        return completeName;
    }
    public void setCompleteName (String completeName) {
        this.completeName = completeName;
    }

    //-----
    public String getDadLastName () {
        return this.dadLastName;
    }
    public void setDadLastName (String dadLastName) {
        this.dadLastName = dadLastName;
    }

    //-----
    public String getMomLastName () {
        return this.momLastName;
    }
    public void setMomLastName (String momLastName) {
        this.momLastName = momLastName;
    }

    //-----
    public String getEmail () {
        return this.email;
    }
    public void setEmail (String email) {
        this.email = email;
    }

    //-----
    public String getPhoneNumber () {
        return this.phoneNumber;
    }
    public void setPhoneNumber (String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    //-----
    public Date getCreated () {
        return this.created;
    }
    public void setCreated (Date created) {
        this.created = created;
    }
}