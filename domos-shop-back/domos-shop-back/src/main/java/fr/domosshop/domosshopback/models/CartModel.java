package fr.domosshop.domosshopback.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CartModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int nbProduct;
    private int nbOrders;
    private int nbAbandonedOrders;
    private float money;

    public CartModel() {
        this.nbProduct = 0;
        this.nbOrders = 0;
        this.nbAbandonedOrders = 0;
        this.money = 0;
    }
}
