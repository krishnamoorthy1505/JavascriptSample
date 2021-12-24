/* import React from 'react'
import {connect} from 'react-redux'
import { COUNTER_DECREMENT, COUNTER_INCREMENT } from './store'
 let Hello =(props) =>{
    return (<h1>
                <button onClick={props.increment}>Increment</button>
                <button onClick={props.decrement}>Decrement</button>
                Hello {props.name}! {props.count}
            </h1>)
}
const mapStateProps=(state)=>{
    return {
        count:state.counter.count
    }
}
const mapDispatchToProps=(dispatch)=>{
    return{
        increment:()=>{dispatch({type: COUNTER_INCREMENT})},
        decrement:()=>{dispatch({type: COUNTER_DECREMENT})},
    }
}
export default connect(mapStateProps,mapDispatchToProps)(Hello) */

import React, { Component } from 'react'
import {connect} from 'react-redux'
import { COUNTER_DECREMENT, COUNTER_INCREMENT } from './store'
 
 class Hello extends Component{
    add = () =>{
        const count ='count' +this.props.count;
        this.props.update(count)
    }
    render(){
    return (<h1>
                <button onClick={this.props.increment}>Increment</button>
                <button onClick={this.props.decrement}>Decrement</button>
                <button onClick={this.add}>Push</button>
                Pushed Data:{this.props.data.length}<br/>
                Hello {this.props.name}! {this.props.count}</h1>)
}
 }
const mapStateProps=(state)=>{
    return {
        count:state.counter.count,
        data:state.tester,
    }
}
const mapDispatchToProps=(dispatch)=>{
    return{
        increment:()=>{dispatch({type: COUNTER_INCREMENT})},
        decrement:()=>{dispatch({type: COUNTER_DECREMENT})},
        update: (data)=>{
            dispatch({type:'push',value:data})

        }

    }
}

export default connect(mapStateProps,mapDispatchToProps)(Hello)
