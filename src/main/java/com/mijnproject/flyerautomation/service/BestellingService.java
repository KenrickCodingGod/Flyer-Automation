package com.mijnproject.flyerautomation.service;

import com.mijnproject.flyerautomation.model.Bestelling;
import com.mijnproject.flyerautomation.repository.BestellingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BestellingService {

    @Autowired
    private BestellingRepository bestellingRepository;

    public Bestelling saveBestelling(Bestelling bestelling) {
        return bestellingRepository.save(bestelling);
    }

    public List<Bestelling> getAllBestellingen() {
        return bestellingRepository.findAll();
    }
}
