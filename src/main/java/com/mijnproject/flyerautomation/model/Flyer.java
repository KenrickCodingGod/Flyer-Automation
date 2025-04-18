package com.mijnproject.flyerautomation.model;

import jakarta.persistence.*;

@Entity
public class Flyer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String beschrijving;

    private String bestandsnaam;
    private String bestandstype;
    private String opslagpad;

    @ManyToOne
    private Gebruiker gebruiker;

    @ManyToOne
    private Bestelling bestelling;

    // Getters en Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBeschrijving() {
        return beschrijving;
    }

    public void setBeschrijving(String beschrijving) {
        this.beschrijving = beschrijving;
    }

    public String getBestandsnaam() {
        return bestandsnaam;
    }

    public void setBestandsnaam(String bestandsnaam) {
        this.bestandsnaam = bestandsnaam;
    }

    public String getBestandstype() {
        return bestandstype;
    }

    public void setBestandstype(String bestandstype) {
        this.bestandstype = bestandstype;
    }

    public String getOpslagpad() {
        return opslagpad;
    }

    public void setOpslagpad(String opslagpad) {
        this.opslagpad = opslagpad;
    }

    public Gebruiker getGebruiker() {
        return gebruiker;
    }

    public void setGebruiker(Gebruiker gebruiker) {
        this.gebruiker = gebruiker;
    }

    public Bestelling getBestelling() {
        return bestelling;
    }

    public void setBestelling(Bestelling bestelling) {
        this.bestelling = bestelling;
    }
}
