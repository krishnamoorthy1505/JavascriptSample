import react from "react";
import reactDom from "react-dom";
import ButtonCounter from  "./ButtonCounter"
export default class LogginButton extends react.Component{
    constructor(params){
        super()
        //bind the event declare construcor is best practice
        //this.handleClick=this.handleClick.bind(this)

    }
    handleClick(){
        //console.log("Handle Click Working")
        //undifined Type Error
        console.log(this)
    }
    handleEvent = (e) => {
        alert("Arrow Event")
        console.log(e)
    }
    render(){
        return(
            <div>
                <button onClick={this.handleClick}>Click Me</button>
                <ButtonCounter></ButtonCounter>

            </div>
        )
    }
}