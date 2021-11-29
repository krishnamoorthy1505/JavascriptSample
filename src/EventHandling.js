import React from "react";
import reactDom from "react-dom";

function Form(){
    function handleEvent(e){
        e.preventDefault();
        console.log("You Click button");
    }
    return(
        <form onSubmit={handleEvent}>
            <button type="submit">Submit</button>
        </form>
    );
}
export default Form;