import { Component, OnInit } from '@angular/core';
import { products } from './predefined-products';
import {ShoppingCartService} from '../../services/shopping-cart.service';

@Component({
  selector: 'app-products',
  templateUrl: './products.component.html',
  styleUrls: ['./products.component.scss']
})
export class ProductsComponent implements OnInit {
  products : Array<any> = [];

  addAlert(){
      window.alert('Le produit a été ajouté au panier!');
    }

    showProducts() {
      this.shoppingCartService.getProducts()
        .subscribe((data: any) => {this.products = data; this.badge()});
    }

    addInCart(id : number) {
          this.shoppingCartService.addInCart(id)
          this.showProducts();
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
