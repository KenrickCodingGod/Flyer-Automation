package com.mijnproject.flyerautomation.service;

import com.mijnproject.flyerautomation.model.Gebruiker;
import com.mijnproject.flyerautomation.repository.GebruikerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GebruikerService {

    @Autowired
    private GebruikerRepository gebruikerRepository;

    public Gebruiker saveGebruiker(Gebruiker gebruiker) {
        return gebruikerRepository.save(gebruiker);
    }

    public List<Gebruiker> getAllGebruikers() {
        return gebruikerRepository.findAll();
    }
}
