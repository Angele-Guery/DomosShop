package fr.domosshop.domosshopback.services;

import fr.domosshop.domosshopback.models.CartModel;
import fr.domosshop.domosshopback.repositories.CartRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Data
@Service
public class CartService {

    @Autowired
    private CartRepository cartRepository;

    public Optional<CartModel> getCart(final Long id){
        return cartRepository.findById(id);
    }

}
