import react from "react";
import React from "react";
class CustomerDetails extends React.Component{
    constructor(props){
            super()
            this.state = { 
                    person :{
                    id: 101,
                    name: "krishna",
                    mail: "krishna@gmail.com"
                }
         }
    }
    clear = () => {
        console.log("clear")
        this.setState({
            person:{
                id:0,
                name:"",
                mail:""
            } 
        });
        
    }
    render(){
        return (
            <div>
                <hr></hr>
                ID :{this.state.person.id}
                Name :{this.state.person.name}
                Mail ID : {this.state.person.mail}
                <button onClick={() => this.clear()}>Clear</button>

            </div>
        )
    }
}
export default CustomerDetails