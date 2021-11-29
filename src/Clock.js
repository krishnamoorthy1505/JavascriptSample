import react from "react";
import React from "react";
import reactDom from "react-dom";
import ReactLifeCycle from "./ReactLife";
import ClockMount from "./State";

export default class Clock extends react.Component{
    constructor(props){
        super(props);
        this.state={date:new Date()};
    }

    render(){
        return(
            <div>
                <ReactLifeCycle/>
                <h1>Clock Without Time Interval</h1>
                <h2>Time is{this.state.date.toLocaleTimeString()}</h2>
            </div>
        );
    }
}

 
