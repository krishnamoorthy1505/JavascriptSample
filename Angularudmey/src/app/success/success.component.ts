import { Component } from "@angular/core";

@Component({
    selector : 'app-success',
    template : `<p><b>This is success </b></p>`,
    styles:[`p{
        padding: 20px;
        background-color: palegreen;
        border : 1px solid green;
    }
    `]
    
})
export class SuccessComponent{

}