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

    @Override
    public String toString() {
        return "CartModel{" +
                "id=" + id +
                ", nbProduct=" + nbProduct +
                ", nbOrders=" + nbOrders +
                ", nbAbandonedOrders=" + nbAbandonedOrders +
                ", money=" + money +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getNbProduct() {
        return nbProduct;
    }

    public void setNbProduct(int nbProduct) {
        this.nbProduct = nbProduct;
    }

    public int getNbOrders() {
        return nbOrders;
    }

    public void setNbOrders(int nbOrders) {
        this.nbOrders = nbOrders;
    }

    public int getNbAbandonedOrders() {
        return nbAbandonedOrders;
    }

    public void setNbAbandonedOrders(int nbAbandonedOrders) {
        this.nbAbandonedOrders = nbAbandonedOrders;
    }

    public float getMoney() {
        return money;
    }

    public void setMoney(float money) {
        this.money = money;
    }
}
