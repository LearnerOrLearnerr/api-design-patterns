package com.greengrocer.products.catalogue.controllers;

import com.greengrocer.products.catalogue.resources.ProductCataloguesHealthChecks;
import org.springframework.boot.actuate.health.Health;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @GetMapping("/health-check")
    public Health healthCheck(@RequestParam (value="APPCODE", defaultValue="ALL") String appCode){
        return new ProductCataloguesHealthChecks().getHealth(true);
    }
}
