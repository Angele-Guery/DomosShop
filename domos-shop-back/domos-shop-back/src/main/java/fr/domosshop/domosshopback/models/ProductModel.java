package fr.domosshop.domosshopback.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ProductModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private double price;
    private String description;
    private int nbInCart;

    public ProductModel(String name,double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.nbInCart = 0;
    }

    public ProductModel() {
    }

    @Override
    public String toString() {
        return "ProductModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", nbInCart=" + nbInCart +
                '}';
    }
}
