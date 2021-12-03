import React from "react";
import Warning from './Warning'

export default class Page extends React.Component{
    constructor(){
        super()
        this.state={isShow:true}
    }
    handlePage = () => {
        this.setState(
            state => ({isShow:!state.isShow})
        )};
    render(){
        return(
            <div>
            <Warning show={this.state.isShow}></Warning>
            <button onClick={this.handlePage}>
            {this.state.isShow?'Show':'hide'}
            </button>
            </div>
        )
    }
}