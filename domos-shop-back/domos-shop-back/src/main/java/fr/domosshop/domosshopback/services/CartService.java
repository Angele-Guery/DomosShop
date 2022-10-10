package fr.domosshop.domosshopback.services;

import fr.domosshop.domosshopback.models.CartModel;
import fr.domosshop.domosshopback.models.ProductModel;
import fr.domosshop.domosshopback.repositories.CartRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Data
@Service
public class CartService {

    @Autowired
    private CartRepository cartRepository;

    public Iterable<CartModel> getCart(){
        return cartRepository.findAll();
    }

    public void buy(float sum) {
        for(CartModel c: cartRepository.findAll()){
            c.setMoney(c.getMoney() + sum);
            c.setNbOrders(c.getNbOrders() + 1);
            cartRepository.save(c);
        }

    }

    public void canceled() {
        for(CartModel c: cartRepository.findAll()){
            c.setNbAbandonedOrders(c.getNbAbandonedOrders() + 1);
            cartRepository.save(c);
        }

    }

}
