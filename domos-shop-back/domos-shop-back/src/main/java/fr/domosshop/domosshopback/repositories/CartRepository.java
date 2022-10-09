package fr.domosshop.domosshopback.repositories;

import java.util.List;

import fr.domosshop.domosshopback.models.CartModel;
import org.springframework.data.repository.CrudRepository;

public interface CartRepository extends CrudRepository<CartModel, Long>{

    CartModel findById(long id);

}
