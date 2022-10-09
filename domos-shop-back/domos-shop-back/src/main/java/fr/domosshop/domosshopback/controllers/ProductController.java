package fr.domosshop.domosshopback.controllers;

import fr.domosshop.domosshopback.models.ProductModel;
import fr.domosshop.domosshopback.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/product")
    public Optional<ProductModel> getProduct(Long id) {
        return productService.getProduct(id);
    }

    @GetMapping("/allproducts")
    public Iterable<ProductModel> getAllProducts() {
        return productService.getAllProducts();
    }

}
