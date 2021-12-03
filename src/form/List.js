import React from "react";
import ReactDom from "react-dom";
import ListKey from "./ListKey";
export default function MyList(){
    const num=myArr.map((val)=>{
        return <li>{val}</li>
    });
    return (<div><ul>{num}</ul>
    <ListKey/></div>)
}
var myArr = [2,5,6,9];
