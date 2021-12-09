import React from "react";

export default class FormText extends React.Component{
    constructor(){
        super()
        this.state={value:""}
        this.handleChange=this.handleChange.bind(this);
        this.handleSubmit=this.handleSubmit.bind(this);
    }
    handleChange(event){
        this.setState({value:event.target.value});
    }
    handleSubmit(event){
        alert("A Name was sumbites"+this.state.value);
        event.preventDefault();
    }
    render(){
        return(
            
            <form onSubmit={this.handleSubmit}>
                name :<input type="text" onChange={this.handleChange}>{this.state.value}</input>

                <input type="submit" value="submit"/>
            </form>
            
        )
    }
}