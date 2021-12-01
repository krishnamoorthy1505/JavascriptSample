import React from "react";
import ReactDOM  from "react-dom";
//import ClassState from "./ClassState";
import ClassState from "./ClassState";
import LifeCycle from "./LifeCycle";

 class ClassProperty extends React.Component{
    render(){
        return (<div><h1>Learn {this.props.var.topic} in {this.props.var.language}</h1>
        <ClassState/>
        <LifeCycle/>
        </div>)
        //return <h1>{this.props.var}</h1>
    }
}
//ClassProperty.defaultProps={topic:"java"}
export default class ClassProperty1 extends React.Component{
    render(){
        const v = {topic: "JSP", language:"Java"}
        return  (<div>
        <ClassProperty var={v}/>
        </div>)

    }
}