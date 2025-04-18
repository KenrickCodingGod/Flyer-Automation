package com.mijnproject.flyerautomation.model;

import jakarta.persistence.*;

@Entity
public class Distributiegebied {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String postcode;
    private String regioNaam;

    // Getters en Setters
}
