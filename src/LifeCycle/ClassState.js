import React from "react";
export default class ClassState extends React.Component{
    constructor(){
        super()
        this.state={initialValue:"Welcome",name:"krishna"}
        this.changeValue=this.changeValue.bind(this)
    }
    changeValue(){
        this.setState({initialValue:"ThankYou"})
    }
    render(){
        return (
        <div>
        <h1>{this.state.initialValue} {this.state.name}</h1>
        <hr></hr>
        <button onClick={this.changeValue}>Click</button>
        </div>)
    }
}
