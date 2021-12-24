import React,{useState,useEffect} from 'react'
export default function HookEffect(){
   const [count,setCount]=useState(0);
   useEffect(() => {
       console.log("useEffect")
       document.title= `you clicked {count} of times`
       
   })
   return(
       <div>
           console.log("render")

           <h1>Count Value : {count}</h1>
           <button onClick={()=>setCount(count+1)} >Increment</button>
           <button onClick={()=>setCount(count-1)} >Decrement</button>

       </div>
   )

}