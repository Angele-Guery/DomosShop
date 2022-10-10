package fr.domosshop.domosshopback.controllers;

import fr.domosshop.domosshopback.models.CartModel;
import fr.domosshop.domosshopback.models.ProductModel;
import fr.domosshop.domosshopback.services.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class CartController {

    @Autowired
    private CartService cartService;

    @CrossOrigin("http://localhost:4200/")
    @GetMapping("/cart")
    public Iterable<CartModel> getCart() {
        return cartService.getCart();
    }


    @CrossOrigin("http://localhost:4200/")
    @PutMapping("/buy")
    public void buy(@RequestBody CartModel c, @RequestParam float sum){cartService.buy(sum);}

    @CrossOrigin("http://localhost:4200/")
    @PutMapping("/canceled")
    public void canceled(@RequestBody CartModel c){cartService.canceled();}
}
