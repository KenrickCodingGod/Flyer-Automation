package com.mijnproject.flyerautomation.service;

import com.mijnproject.flyerautomation.model.Bestelling;
import com.mijnproject.flyerautomation.model.Flyer;
import com.mijnproject.flyerautomation.model.Gebruiker;
import com.mijnproject.flyerautomation.repository.BestellingRepository;
import com.mijnproject.flyerautomation.repository.FlyerRepository;
import com.mijnproject.flyerautomation.repository.GebruikerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public class FlyerService {

    @Autowired
    private FlyerRepository flyerRepository;

    @Autowired
    private GebruikerRepository gebruikerRepository;

    @Autowired
    private BestellingRepository bestellingRepository;

    public Flyer saveFlyer(Flyer flyer) {
        return flyerRepository.save(flyer);
    }

    public List<Flyer> getAllFlyers() {
        return flyerRepository.findAll();
    }

    public Flyer opslaanMetRelaties(MultipartFile file, String title, String beschrijving, Long gebruikerId, Long bestellingId) {
        Flyer flyer = new Flyer();
        flyer.setTitle(title);
        flyer.setBeschrijving(beschrijving);
        flyer.setBestandsnaam(file.getOriginalFilename());
        flyer.setBestandstype(file.getContentType());
        flyer.setOpslagpad("uploads/" + file.getOriginalFilename());

        // Relaties ophalen en koppelen
        Gebruiker gebruiker = gebruikerRepository.findById(gebruikerId).orElse(null);
        Bestelling bestelling = bestellingRepository.findById(bestellingId).orElse(null);
        flyer.setGebruiker(gebruiker);
        flyer.setBestelling(bestelling);

        return flyerRepository.save(flyer);
    }

}
