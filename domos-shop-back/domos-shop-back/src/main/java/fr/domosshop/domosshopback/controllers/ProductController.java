package fr.domosshop.domosshopback.controllers;

import fr.domosshop.domosshopback.models.ProductModel;
import fr.domosshop.domosshopback.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.Optional;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @CrossOrigin("http://localhost:4200/")
    @GetMapping("/product/{id}")
    public Optional<ProductModel> getProduct(@PathParam("id") Long id) {
        return productService.getProduct(id);
    }

    @CrossOrigin("http://localhost:4200/")
    @GetMapping("/allproducts")
    public Iterable<ProductModel> getAllProducts() {
        return productService.getAllProducts();
    }

    @CrossOrigin("http://localhost:4200/")
    @PutMapping("/addInCart/{id}")
    public Optional<ProductModel> addInCart(@RequestBody ProductModel p, @PathVariable("id") Long id){ return productService.addInCart(id);}

    @CrossOrigin("http://localhost:4200/")
    @PutMapping("/removeFromCart/{id}")
    public Optional<ProductModel> removeFromCart(@RequestBody ProductModel p, @PathVariable("id") Long id){return productService.removeFromCart(id);}

    @CrossOrigin("http://localhost:4200/")
    @PutMapping("/removeAllCart")
    public void removeAllCart(@RequestBody ProductModel p){productService.removeAllCart();}
}
