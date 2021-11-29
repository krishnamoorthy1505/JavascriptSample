import react from "react";
import React from "react";

import AddDeleteHook from "./AddDeleteHook";
import State from "./State";

export default class ReactLifeCycle extends React.Component {
    constructor(props){
        super(props);
        console.log("Clock Constructor")
        this.state={date:new Date()};
    }
    componentDidMount(){
        this.timeID=setInterval(
            () => this.tick() ,1000
        );

    }
    componentWillUnmount(){
        clearInterval(this.timeID);
    }
    tick(){
        this.setState({
            date: new Date()}
        );
    }

    render(){
        console.log("Clock Render")
        return(
            <div>
                <State/>
                <AddDeleteHook/>
                <h1> React Life Cycle Timer </h1>
                <h2>Time is{this.state.date.toLocaleTimeString()}</h2>
                <button onClick={this.componentWillUnmount.bind(this)}>Clear</button>
            </div>
        );
    }
}

 
