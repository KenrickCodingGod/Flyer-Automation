package com.mijnproject.flyerautomation.Controller;

import com.mijnproject.flyerautomation.model.Distributiegebied;
import com.mijnproject.flyerautomation.service.DistributiegebiedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/gebieden")
public class DistributiegebiedController {

    @Autowired
    private DistributiegebiedService distributiegebiedService;

    @PostMapping
    public Distributiegebied saveGebied(@RequestBody Distributiegebied gebied) {
        return distributiegebiedService.saveDistributiegebied(gebied);
    }

    @GetMapping
    public List<Distributiegebied> getAllGebieden() {
        return distributiegebiedService.getAllGebieden();
    }
}
