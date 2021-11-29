import React from "react";
import reactDom from 'react-dom';

export default function Employee(props){
    return (
        <div>
            <h6>Hello :{props.name}</h6>
            <h1>Emp ID:{props.empid}</h1>
        </div>
    );

    
}
/* class Employee extends React.Component{
    render(){
        return (
            <div>
                <h6>Hello :{this.props.name}</h6>
                <h1>Emp ID:{this.props.empid}</h1>
            </div>
        );
    
    }
} */