import React from "react";
import Skills from "./Skills"
export default function Employee(props){
    return(
        <div>
            <h1>Emp ID : {props.empid}</h1>
            <h1>Name :{props.name}</h1>
            <Skills empskill="Java Developer"></Skills>
        </div>
    )
}