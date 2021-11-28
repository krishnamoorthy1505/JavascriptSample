import React from "react";
import FullDetail from "./FullDetails"
export default function Skills(props){
    return(
        <div>
            <h1 style={{color:"red"}}>
                MySkill :{props.empskill}
            </h1>
            <FullDetail location="Chennai"></FullDetail>
            
        </div>
    )
}
