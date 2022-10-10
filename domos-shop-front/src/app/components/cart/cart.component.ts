import { Component, OnInit } from '@angular/core';
import { products } from '../products/predefined-products';
import {ShoppingCartService} from '../../services/shopping-cart.service'

@Component({
  selector: 'app-cart',
  templateUrl: './cart.component.html',
  styleUrls: ['./cart.component.scss']
})
export class CartComponent implements OnInit {

  products : Array<any> = [];
  sum =0;

  removeAlert(){
    window.alert('Le produit a été suprimé du panier!');
  }

  removeAllAlert(){
    window.alert('Le panier a été vidé!');
  }

  buyAlert(){
    window.alert('Merci pour vos achats!');
  }

    showProducts() {
      this.shoppingCartService.getProducts()
      .subscribe((data: any) => {this.products = data; this.sumPrices(); this.badge()});
    }


    removeFromCart(id : number) {
      this.shoppingCartService.removeFromCart(id)
      this.showProducts();
    }

    removeAllCart() {
      this.shoppingCartService.removeAllCart()
      this.showProducts();
    }

    buy(sum : number) {
          this.shoppingCartService.buy(sum)
        }

    sumPrices(){
      for(var product of this.products){
        this.sum = this.sum + product.price * product.nbInCart;
      }
    }

    canceled() {
        this.shoppingCartService.canceled()
    }

    badge(){
      this.shoppingCartService.nbProductAdded = 0;
      for(var product of this.products){
        this.shoppingCartService.nbProductAdded = this.shoppingCartService.nbProductAdded + product.nbInCart;
      }
      if(this.shoppingCartService.nbProductAdded != 0){
        this.shoppingCartService.hidden = false;
      }
      else{
        this.shoppingCartService.hidden = true;
      }
    }

  constructor(public shoppingCartService : ShoppingCartService) { }

  ngOnInit(): void {
    this.showProducts();
  }

}
