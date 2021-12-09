import React from "react";
import { BrowserRouter  , Routes ,Route , Link ,NavLink, Switch} from "react-router-dom";
import About from "./about";
import Home from "./home";
import ReactForm from "../form/MyForm"
export default function RouterJS(){
return(
    <BrowserRouter>
        <div>
            <h1>Router </h1>
            <Route exact path='/' component={Home}/>
            <Route path='/a' component={About}/>
            <Route path='/f' component={ReactForm}/>
        </div>
    </BrowserRouter>
)}
