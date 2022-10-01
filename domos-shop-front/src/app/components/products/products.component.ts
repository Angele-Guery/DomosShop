import { Component, OnInit } from '@angular/core';
import { products } from './predefined-products';


@Component({
  selector: 'app-products',
  templateUrl: './products.component.html',
  styleUrls: ['./products.component.scss']
})
export class ProductsComponent implements OnInit {
  products = products;

  add(){
      window.alert('Le produit a été ajouté au panier!');
    }

  constructor() { }

  ngOnInit(): void {

  }

}
