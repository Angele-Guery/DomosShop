package fr.domosshop.domosshopback.repositories;

import java.util.List;

import fr.domosshop.domosshopback.models.ProductModel;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<ProductModel, Long>{
    ProductModel findById(long id);

}
