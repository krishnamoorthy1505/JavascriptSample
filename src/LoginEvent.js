import React from "react";
import reactDom from "react-dom";
import LoginButton from "./LoginButton"

function LoginEvent(){
    function handleClick(){
        console.log("Fuction Click")
    }
    let myEvent=() => {
        console.log("Arrow Event");
    }
    return(
        <div className="div">
            <button onClick={handleClick}>Login</button>
            <button onClick={myEvent}>Arrow Event</button>
            <LoginButton/>
        </div>
    )
}
export default LoginEvent