import { useState } from "react";
import React from "react";
import CountLifeCycle from "./LifeCycle/CountLifeCycle"

const AddDeleteHook = () =>{
    const [button, setButton]=useState("");
    const addButton = () =>{
        setButton("Add");
        console.log("Button Add"+{button});
    }
    const deleteButton =() => {
        setButton("Delete");
        console.log("Delete Button"+{button});
    }
    return(
        <div>
            <button onClick={() =>addButton()}>Add</button>
            <button onClick={()=> deleteButton()}>Delete</button><br/>
            <hr></hr>
        <CountLifeCycle/>
            
        </div>
    )
}

export default AddDeleteHook