import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-dir',
  templateUrl: './dir.component.html',
  styleUrls: ['./dir.component.css']
})
export class DirComponent implements OnInit {
  showSecret=false;
  log :any =[];
  constructor() { }

  ngOnInit(): void {
  }
  onToggleDetails(){
    this.showSecret = ! this.showSecret;
    this.log.push(this.log.length + 1);
  }

}
