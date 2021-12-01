import React from "react";
export default class LifeCycle extends React.Component{
    constructor(){
        super()
        this.state={value :"Welcome",name:"krishna"}
        
    }
    componentWillMount(){
        alert("componentWillMount")
    }
    componentWillUnmount(){
        alert("UnMount")
    }
    componentWillUpdate(){
        alert("ComponentWillUpdate")
    }
    changeValue=()=>{
       // alert("")
        this.setState({value:"thank you"})
    }
    changeDelete =() =>{
        this.setState({value:false,name:false})
    }
    render(){
        return(<div>
            <h1>{this.state.value} {this.state.name}</h1>
            <button onClick={this.changeValue}>Click</button>
            <button onClick={this.changeDelete}>Delete</button>
            <h1 id="mydiv"></h1>
            </div>
        )

    }
    componentDidMount(){
        setTimeout(() => ({value:"Time Out % Seconds"
            
        }), 5000);
    }
    componentDidUpdate(){
        document.getElementById("mydiv").innerHTML="Did New Value Updated"+this.state.value
    }
    shouldComponentUpdate(){
            return true
    }
}