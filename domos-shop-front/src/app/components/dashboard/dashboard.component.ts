import { Component, OnInit } from '@angular/core';
import {ShoppingCartService} from '../../services/shopping-cart.service';

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.scss']
})
export class DashboardComponent implements OnInit {
cart : Array<any> = [];

showCart() {
      this.shoppingCartService.getCart()
        .subscribe((data: any) => this.cart = data);
    }

  constructor(public shoppingCartService : ShoppingCartService) { }

  ngOnInit(): void {
  this.showCart();
  }

}
