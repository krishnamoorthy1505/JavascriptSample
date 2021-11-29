import react from "react";
import React from "react";
import reactDom from "react-dom";
import Form from "./EventHandling";

export default class State extends react.Component{
    constructor(props){
        super(props);
        this.state={
            id:101,
            name:"krishna"
        };
    }
    
    render(){
        return(
            <div>
                <h1>State Change</h1>
                <Form/>
                <h2>ID:{this.state.id} , Name :{this.state.name}</h2>
            </div>
        );
    }
}
 

 
