import React from "react";
import reactDom from "react-dom";
import IndexKey from './ListKeyIndex'
export default function ListKey(){
    const myEmp=myObj.map((show) =>
        <div key={show.id}>
            <li>{show.id}: {show.name}: {show.age}</li>
        </div>
    );
    return <div>{myEmp}<IndexKey/></div>

}
const myObj = [
    { id: 101, name:"krishna",age: 18},
    {id: 102 , name: "gopi", age:20}

];
