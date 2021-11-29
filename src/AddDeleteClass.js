import React from "react";
import ReactDOM from "react";
import AddDeleteHook from "./AddDeleteHook"
class AddDelete extends React.Component{
    constructor(prop){
        super()
    }
    state = {
        buttonPressed:"" 
    };
    onAddPress(){
        this.setState({buttonPressed : "ADD"});
        console.log("Add was Pressed")
    }
    onDeletePress(){
        this.setState({buttonPressed : "DELETE"});
        console.log("  Delete was Pressed ")
    }
    render(){
        return(
            <div>
                {/* declare Arrow Function using () in function */}
                
            <button onClick={() => this.onAddPress()}>Add</button>
            <button onClick={() => this.onDeletePress()}>Delete</button>
            </div>

        )
    }
}
export default AddDelete