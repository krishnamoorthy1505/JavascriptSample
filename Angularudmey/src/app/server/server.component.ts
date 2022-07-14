import { Component } from "@angular/core";
@Component({
    selector : 'app-server',
    templateUrl : './server.component.html',
 
})
export class ServerComponent {
    serverId: number = 100;
    serverStatus: string = "offLine";
    username = " ";
    constructor() {
        this.serverStatus = Math.random() >  0.5 ? 'onLine' : 'offLine';
    }
    getServerStatus() {
        return this.serverStatus;
    }
    getColor() {
    }
}