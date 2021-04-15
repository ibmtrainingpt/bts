import { Component, OnInit } from '@angular/core';
import { User } from './User';

@Component({
  selector: 'app-userform',
  templateUrl: './userform.component.html',
  styleUrls: ['./userform.component.css']
})
export class UserformComponent implements OnInit {    //controller
  title: string = 'Userform';
  user:User = new User(); //model - stores all form data
  constructor() { }

  userArray: User[] = [];

  save(){
    this.userArray.push(this.user);
    console.log(this.user.firstname);

    // this.user.firstname = "Rashi";   //value of textbox is changed to Rashi

  }

  ngOnInit(): void {
  }

}
