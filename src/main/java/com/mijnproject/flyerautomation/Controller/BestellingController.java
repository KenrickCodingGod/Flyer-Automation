package com.mijnproject.flyerautomation.Controller;

import com.mijnproject.flyerautomation.model.Bestelling;
import com.mijnproject.flyerautomation.service.BestellingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bestellingen")
public class BestellingController {

    @Autowired
    private BestellingService bestellingService;

    @PostMapping
    public Bestelling saveBestelling(@RequestBody Bestelling bestelling) {
        return bestellingService.saveBestelling(bestelling);
    }

    @GetMapping
    public List<Bestelling> getAllBestellingen() {
        return bestellingService.getAllBestellingen();
    }
}
