import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ShoppingCartService {
  hidden = true;
  nbProductAdded = 0;

  incrementBadge(){
  this.nbProductAdded++;
    if(this.nbProductAdded != 0){
      this.hidden = false;
    }
  }

  decrementBadge(){
    if(this.nbProductAdded > 0){
      this.nbProductAdded--;
    }
      if(this.nbProductAdded == 0){
        this.hidden = true;
      }
    }

   emptyCart(){
   this.nbProductAdded =0;
   this.hidden = true;
   }

  constructor() { }
}
