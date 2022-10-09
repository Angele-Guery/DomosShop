package fr.domosshop.domosshopback.controllers;

import fr.domosshop.domosshopback.models.CartModel;
import fr.domosshop.domosshopback.services.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class CartController {

    @Autowired
    private CartService cartService;

    @GetMapping("/cart")
    public Optional<CartModel> getCart(Long id) {
        return cartService.getCart(id);
    }

}
