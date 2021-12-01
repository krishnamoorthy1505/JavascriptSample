import React from "react";
import { ReactDOM } from "react";
import ReactLifeCycle from "../ReactLife";
import CustomerDetails from "./CustomeDetails"
class CountLifeCycle extends React.Component{
    constructor(props){
        super()
        console.log("App Constructor")
        this.state={count:0}
    }
    componentDidMount(){
        console.log("Application Mount")

    }
    componentDidUpdate(prevProps,prevState){
        console.log("App Updated");
        console.log("Prev Prop",prevProps)
        console.log("PrevStat",prevState)
    }
    componentWillUnmount(){

    }
    increment(){
        
            let count=this.state.count 
            this.setState( {count : count + 1} )
        
    }
   // Arrow function not bind 
    decrement = () =>{
        let count=this.state.count 
        this.setState( {count : count - 1} )

    }
    handleReset() {
        this.setState({count:null})
    }
    render(){
        console.log("Application Rendered")
        return(
            <div>
                    
                    <hr></hr>
                    <h1>React LifeCycle </h1>
                    <h6>Count : {this.state.count}</h6>
                    <button onClick={this.increment.bind(this)}>+ Plus</button>
                    <button onClick={this.decrement}>- Plus</button>
                    <button onClick={() => this.handleReset()}>Reset</button>
                    
                    <CustomerDetails></CustomerDetails><hr></hr>
                    
            </div>
        )
    }
}
export default CountLifeCycle