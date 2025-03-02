package com.greengrocer.products.catalogue.resources;

import com.greengrocer.gen.entity.ProductsSummary;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/content/v1")
public class ProductCatalogues {
    @GetMapping ("/products")
    public ProductsSummary getProducts() {
        ProductsSummary product = new ProductsSummary();
        product.setProductId("123");
        product.setName("Kilkuli");
        return product;
    }
}
