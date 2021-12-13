import { render } from '@testing-library/react'
import React, { Component } from 'react'

export default class PlayerContent extends Component
{
    render(){
        return(
            <button onClick={()=>{this.props.clickHandler(this.props.id,this.props.name)}} style={{color: this.props.active?"green":"red"}}>{this.props.name}</button>
        );
    }
}