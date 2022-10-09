package fr.domosshop.domosshopback.services;

import java.util.Optional;

import fr.domosshop.domosshopback.models.ProductModel;
import fr.domosshop.domosshopback.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.Data;


@Data
@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Optional<ProductModel> getProduct(final Long id){
        return productRepository.findById(id);
    }

    public Iterable<ProductModel> getAllProducts(){
        return productRepository.findAll();
    }

}
