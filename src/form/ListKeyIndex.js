import React from "react";
import { ReactDOM } from "react";
import ListKey from "./ListKey";
function ListKeyIndex(prop){
    const key = prop.keys;
    const item = prop.item;
    return(
        <li>{key} {item}</li>
    )

}
export default function IndexKey() {
    const index = myList.map((value,index) => 
    <ListKeyIndex keys={value} item={value}/>
    );
    return <div><ul>{index}</ul></div>
}

    

const myList = [1000,2000,40000,5000];