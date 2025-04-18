package com.mijnproject.flyerautomation.service;

import com.mijnproject.flyerautomation.model.VerzendOptie;
import com.mijnproject.flyerautomation.repository.VerzendOptieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VerzendOptieService {

    @Autowired
    private VerzendOptieRepository verzendOptieRepository;

    public VerzendOptie saveVerzendOptie(VerzendOptie optie) {
        return verzendOptieRepository.save(optie);
    }

    public List<VerzendOptie> getAllVerzendOpties() {
        return verzendOptieRepository.findAll();
    }
}
