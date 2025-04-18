package com.mijnproject.flyerautomation.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Bestelling {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate besteldatum;

    @ManyToOne
    private Gebruiker gebruiker;

    @OneToOne
    private Distributiegebied distributiegebied;

    @OneToOne
    private VerzendOptie verzendOptie;

    // Getters en Setters
}
