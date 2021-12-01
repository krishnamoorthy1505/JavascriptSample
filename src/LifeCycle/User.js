import React from "react";

class User extends React.Component{
    person = { 
        userName : "moorthy",
        Email : "krishna@gmail.com"
    }
    componentWillUnmount(){
        console.warn("componentwillUnmount call")
        alert("User has benn deleted")
    }
    render(){
        return(
            <div>
                <h6>UserName :{this.person.userName}</h6>
                <h6>Email  : {this.person.Email}</h6>
            </div>
        )
    }
   

    
}
export default User