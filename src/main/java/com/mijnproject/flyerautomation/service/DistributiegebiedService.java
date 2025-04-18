package com.mijnproject.flyerautomation.service;

import com.mijnproject.flyerautomation.model.Distributiegebied;
import com.mijnproject.flyerautomation.repository.DistributiegebiedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DistributiegebiedService {

    @Autowired
    private DistributiegebiedRepository distributiegebiedRepository;

    public Distributiegebied saveDistributiegebied(Distributiegebied gebied) {
        return distributiegebiedRepository.save(gebied);
    }

    public List<Distributiegebied> getAllGebieden() {
        return distributiegebiedRepository.findAll();
    }
}
