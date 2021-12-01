import React , {useState} from "react";
import AddDelete from "./AddDeleteClass"
function HookCount(){
    const state= useState(345)
    console.log(state)
    
    //Unstructered Array
    let [R,E,D]=[10,20,20]
    console.log(D)
    const [count, setCount] = useState(0);

    return(
        <div>
        <p>You Clicked : {count} value</p>
        <button onClick = {() => setCount(count+1)}> Hook Click</button>
        <AddDelete></AddDelete>
        </div>
    )
}
export default HookCount