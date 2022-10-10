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

    public Optional<ProductModel> addInCart(final Long id) {
        return productRepository.findById(id)
                .map(ProductModel -> {
                    ProductModel.setNbInCart(ProductModel.getNbInCart()+1);
                    return productRepository.save(ProductModel);
                });
    }

    public Optional<ProductModel> removeFromCart(final Long id) {
        return productRepository.findById(id)
                .map(ProductModel -> {
                    if(ProductModel.getNbInCart()>0){ProductModel.setNbInCart(ProductModel.getNbInCart()-1);}
                    return productRepository.save(ProductModel);
                });
    }

    public void removeAllCart() {
                for(ProductModel p : productRepository.findAll()){
                    p.setNbInCart(0);
                    productRepository.save(p);
                }

    }



}
