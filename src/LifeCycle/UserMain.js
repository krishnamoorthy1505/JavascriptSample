import React from "react";
import User from "./User"
class UserMain extends React.Component{
    constructor(){
        super()
        this.state = {
            toggleUser:true
        }
    }
    render(){
        return(
            <div>
                {this.state.toggleUser ? <User/> : null}
                <button onClick={ () => {this.setState({toggleUser : ! this.state.toggleUser})}}>Remove User</button>
            </div>
        )
    }
}
export default UserMain;