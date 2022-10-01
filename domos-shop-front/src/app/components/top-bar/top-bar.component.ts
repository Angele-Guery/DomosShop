import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-top-bar',
  templateUrl: './top-bar.component.html',
  styleUrls: ['./top-bar.component.scss']
})
export class TopBarComponent implements OnInit {
  hidden = false;
  nbProductAdded = 7;

  badge(){
      this.hidden = !this.hidden;
    }


  constructor() { }

  ngOnInit(): void {
  }

}
