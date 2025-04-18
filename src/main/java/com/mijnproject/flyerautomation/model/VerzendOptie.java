package com.mijnproject.flyerautomation.model;

import jakarta.persistence.*;

@Entity
public class VerzendOptie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String naam;
    private double prijs;
    private int levertijdInDagen;

    // Getters en Setters
}
