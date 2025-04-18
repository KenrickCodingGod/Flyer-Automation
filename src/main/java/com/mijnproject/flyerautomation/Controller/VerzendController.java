package com.mijnproject.flyerautomation.Controller;

import com.mijnproject.flyerautomation.service.BudgetVerzendService;
import com.mijnproject.flyerautomation.service.PostNLVerzendService;
import com.mijnproject.flyerautomation.service.VerzendService;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/verzend")
public class VerzendController {

    @GetMapping("/kosten")
    public Map<String, Object> berekenVerzendkosten(@RequestParam String methode, @RequestParam int gewicht) {
        VerzendService service;

        if ("postnl".equalsIgnoreCase(methode)) {
            service = new PostNLVerzendService();
        } else if ("budget".equalsIgnoreCase(methode)) {
            service = new BudgetVerzendService();
        } else {
            throw new IllegalArgumentException("Onbekende verzendmethode: " + methode);
        }

        Map<String, Object> response = new HashMap<>();
        response.put("verzenddienst", service.getNaam());
        response.put("gewicht", gewicht);
        response.put("kosten", service.berekenKosten(gewicht));
        return response;
    }
}
