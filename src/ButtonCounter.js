import reactDom from "react-dom";
import React from "react";
import HookCount from "./HookCount"

class ButtonCounter extends React.Component{
    constructor(params){
        super()
        this.state={ count: 0 }
    }
    handleClick(){
        this.setState({
            count: this.state.count + 1
        },function(){
            console.log("job is done")
        });
    }
    render(){
        return(
            <div className="app">
                <div className="click-count">
                    Button Press :{this.state.count}
                </div>
                <button onClick={this.handleClick.bind(this)}>Add One</button>

                <HookCount></HookCount>

            </div>
        )
    }
}

export default ButtonCounter