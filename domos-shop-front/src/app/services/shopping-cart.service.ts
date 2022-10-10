import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ShoppingCartService {
  hidden = true;
  nbProductAdded = 0;

//   incrementBadge(){
//   this.nbProductAdded++;
//     if(this.nbProductAdded != 0){
//       this.hidden = false;
//     }
//   }
//
//   decrementBadge(){
//     if(this.nbProductAdded > 0){
//       this.nbProductAdded--;
//     }
//       if(this.nbProductAdded == 0){
//         this.hidden = true;
//       }
//     }

//    emptyCart(){
//    this.nbProductAdded =0;
//    this.hidden = true;
//    }

  getProducts() {
    return this.http.get<any>("http://localhost:5000/allproducts");
  }

  addInCart(id : number) {
//       this.incrementBadge();
      return this.http.put<any>(`http://localhost:5000/addInCart/${id}`,{}).subscribe();
    }

  removeFromCart(id : number) {
//       this.decrementBadge();
      return this.http.put<any>("http://localhost:5000/removeFromCart/"+id,{}).subscribe();
  }

  removeAllCart() {
//         this.emptyCart();
        return this.http.put<any>("http://localhost:5000/removeAllCart/",{}).subscribe();
    }

  buy(sum : number) {
      return this.http.put<any>("http://localhost:5000/buy?sum="+sum,{}).subscribe();
  }

  getCart() {
      return this.http.get<any>("http://localhost:5000/cart");
  }

  canceled() {
        return this.http.put<any>("http://localhost:5000/canceled",{}).subscribe();
    }



  constructor(private http: HttpClient) { }
}
