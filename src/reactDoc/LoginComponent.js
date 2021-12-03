import React from "react";
import Greeting from "./greeting";
import Page from "./Page";
function Login(props){
    return(
        <button onClick={props.onClick}>Login</button>
    )
}
function Logout(props){
    return(
        <button onClick={props.onClick}>Logout</button>

    )
}
export default class LoginController extends React.Component{
    constructor(){
        super()
        this.state=({isLogged:false})

    }
    handleLoginClick = () =>{
        this.setState({isLogged:true})
    }
    handleLogoutClick = () =>{
        this.setState({isLogged:false})
    }
    render(){
        const isLogged=this.state.isLogged
        let button
        if(!isLogged){
           button= <Login onClick={this.handleLoginClick}/>
        }
        else {
            button=<Logout onClick={this.handleLogoutClick}/>
       }
        
        
        return(
            <div>
                <Greeting isLogged={isLogged}/>
                {button}
                <Page/>
            </div>
        )
    }

}