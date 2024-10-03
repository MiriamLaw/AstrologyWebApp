package com.coderscampus.SpringSecurityJWTDemo.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "birth_charts")
public class BirthChart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    private String sunSign;
    private String moonSign;
    private String ascendant;

    // Add fields as needed for birth chart details like date, location, etc.


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getSunSign() {
        return sunSign;
    }

    public void setSunSign(String sunSign) {
        this.sunSign = sunSign;
    }

    public String getMoonSign() {
        return moonSign;
    }

    public void setMoonSign(String moonSign) {
        this.moonSign = moonSign;
    }

    public String getAscendant() {
        return ascendant;
    }

    public void setAscendant(String ascendant) {
        this.ascendant = ascendant;
    }
}
