package com.mijnproject.flyerautomation.Controller;

import java.util.List;

import com.mijnproject.flyerautomation.model.Flyer;
import com.mijnproject.flyerautomation.service.FlyerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/flyers")
public class FlyerController {

    @Autowired
    private FlyerService flyerService;

    @PostMapping(value = "/upload", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<Flyer> uploadFlyer(
            @RequestParam("file") MultipartFile file,
            @RequestParam("title") String title,
            @RequestParam("beschrijving") String beschrijving,
            @RequestParam("gebruikerId") Long gebruikerId,
            @RequestParam("bestellingId") Long bestellingId
    ) {
        Flyer opgeslagen = flyerService.opslaanMetRelaties(file, title, beschrijving, gebruikerId, bestellingId);
        return ResponseEntity.ok(opgeslagen);
    }

    @GetMapping
    public List<Flyer> getAllFlyers() {
        return flyerService.getAllFlyers();
    }
}
