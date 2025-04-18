package com.mijnproject.flyerautomation.Controller;

import com.mijnproject.flyerautomation.model.VerzendOptie;
import com.mijnproject.flyerautomation.service.VerzendOptieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/verzendopties")
public class VerzendOptieController {

    @Autowired
    private VerzendOptieService verzendOptieService;

    @PostMapping
    public VerzendOptie saveVerzendOptie(@RequestBody VerzendOptie optie) {
        return verzendOptieService.saveVerzendOptie(optie);
    }

    @GetMapping
    public List<VerzendOptie> getAllVerzendOpties() {
        return verzendOptieService.getAllVerzendOpties();
    }
}
