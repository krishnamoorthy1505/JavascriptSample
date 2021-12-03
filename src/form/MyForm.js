import React, { Component } from "react";
import reactDom from 'react-dom';
 import 'bootstrap/dist/css/bootstrap.min.css'

class ReactForm extends React.Component{
    constructor(){
        super()
        this.state={userName:"",
        age:null,
        errorMessage:""
        }
    }
    userValue = (e) => {
        let n=e.target.name
        let v=e.target.value
        let err=""
        if(n==="age"){
            if(v!="" & !Number(v)){
                err=<strong>Inavalid Value ! Your age must be a number</strong>
            }
        }
        //this.setState({userName: e.target.value})
        this.setState({errorMessage:err})
        this.setState({[n]:v})
    }
    formsubmit =  (event) => {
        
        event.preventDefault()
        alert(" My Name"+this.state.userName)
    }
    render(){
        return (
            <form onSubmit={this.formsubmit}>
                Hello :<p class="text-success">{this.state.userName}</p><br/>
                Your Age:<p>{this.state.age}</p><br/>
                Name :<input type="text" name="userName" onChange={this.userValue}/>
                Age :<input type="text" name="age" onChange={this.userValue}></input><p class="text-danger">{this.state.errorMessage}</p>
                <input type="submit"/>
            </form>
            
        )
    }
}
export default ReactForm