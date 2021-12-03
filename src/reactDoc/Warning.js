import React from "react";

/* export default class Warning extends React.Component{
    message=this.props.show;

    if(message){
        return null;
    }
    return(
        
        <div className='Warning'><h1>Warning</h1></div>
    )
} */

 export default function Warning(props){
    if(!props.show){
        return null
    }
    return(
        <div>
            <h1>Warning !!!!!!!</h1>
        </div>
    )
}