import { Component, OnInit } from '@angular/core';
import { products } from '../products/predefined-products';
import {ShoppingCartService} from '../../services/shopping-cart.service'

@Component({
  selector: 'app-cart',
  templateUrl: './cart.component.html',
  styleUrls: ['./cart.component.scss']
})
export class CartComponent implements OnInit {

  products = products;

  removeAlert(){
    window.alert('Le produit a été suprimé du panier!');
  }

  removeAllAlert(){
    window.alert('Le panier a été vidé!');
  }

  buyAlert(){
    window.alert('Merci pour vos achats!');
  }

  constructor(public shoppingCartService : ShoppingCartService) { }

  ngOnInit(): void {
  }

}
