package fr.domosshop.domosshopback;

import fr.domosshop.domosshopback.models.CartModel;
import fr.domosshop.domosshopback.models.ProductModel;
import fr.domosshop.domosshopback.repositories.CartRepository;
import fr.domosshop.domosshopback.repositories.ProductRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Collection;

@SpringBootApplication
public class DomosShopBackApplication {

	private static final Logger log = LoggerFactory.getLogger(DomosShopBackApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(DomosShopBackApplication.class);
	}

	@Bean
	public CommandLineRunner initProduct(ProductRepository repository) {
		return (args) -> {
			// save some products
				if(((Collection<ProductModel>) repository.findAll()).size() == 0){
					repository.save(new ProductModel("Montre Bleu",130, ""));
					repository.save(new ProductModel("Casque Bluetooth", 59.99, "O'Un casque bluetooth de très bonne qualité"));
					repository.save(new ProductModel("Souris Gamer", 24.99, "Souris gamer avec boutons programmables"));
					repository.save(new ProductModel("Clavier Gamer", 40, ""));
				}
		};
	}

	@Bean
	public CommandLineRunner initCart(CartRepository repository) {
		return (args) -> {

			if(((Collection<CartModel>) repository.findAll()).size() == 0){
				repository.save(new CartModel());
			}
		};
	}


}
