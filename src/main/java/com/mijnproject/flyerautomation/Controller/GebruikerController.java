package com.mijnproject.flyerautomation.Controller;

import com.mijnproject.flyerautomation.model.Gebruiker;
import com.mijnproject.flyerautomation.service.GebruikerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/gebruikers")
public class GebruikerController {

    @Autowired
    private GebruikerService gebruikerService;

    @PostMapping
    public Gebruiker saveGebruiker(@RequestBody Gebruiker gebruiker) {
        return gebruikerService.saveGebruiker(gebruiker);
    }

    @GetMapping
    public List<Gebruiker> getAllGebruikers() {
        return gebruikerService.getAllGebruikers();
    }
}
