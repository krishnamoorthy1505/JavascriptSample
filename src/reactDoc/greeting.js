
import React from "react";
import reactDom from "react-dom";
function UserGreeting(){
    return <h1>Welcome user</h1>
}
function GuestGreeting(){
    return <h1>Signup</h1>
}
export default function Greeting(props){
    const isLogged=props.isLogged;
    if(isLogged){
        return <UserGreeting/>
    }
    return <GuestGreeting/>
}
reactDom.render(<Greeting isLogged='false'/>,document.getElementById('root'))