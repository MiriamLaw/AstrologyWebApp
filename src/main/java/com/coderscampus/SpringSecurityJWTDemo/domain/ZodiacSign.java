package com.coderscampus.SpringSecurityJWTDemo.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "zodiac_signs")
public class ZodiacSign {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;  // e.g., Aries, Taurus, etc.
    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
