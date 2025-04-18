package com.mijnproject.flyerautomation.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Gebruiker {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String naam;
    private String email;

    @OneToMany(mappedBy = "gebruiker")
    private List<Flyer> flyers;

    @OneToMany(mappedBy = "gebruiker")
    private List<Bestelling> bestellingen;

    // Getters en Setters
}
