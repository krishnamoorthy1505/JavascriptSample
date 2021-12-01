//import react from "react";
import React from "react";
import UserMain from "./UserMain"
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
                <br></br>
                <hr></hr>
                <UserMain/>

            </div>
        )
    }
}
export default CustomerDetails