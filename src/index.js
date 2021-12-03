import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import App from './App';

import reportWebVitals from './reportWebVitals';
import reactDom from 'react-dom';
import Employee  from './Employee';
import Employee1 from './Employee1'
import Clock from './Clock'
import Clock1 from './Clock'
import Form from './EventHandling'
import LoginEvent from './LoginEvent'
import ReactLifeCycle from './ReactLife';
import AddDeleteHook from './AddDeleteHook';
import Toggle from "./Toggle"
import ClassProperty from './LifeCycle/ClassProperty'
import ClassProperty1 from './LifeCycle/ClassProperty'
import ClassState from './LifeCycle/ClassState';
import ReactForm from './form/MyForm'
import { ListGroup } from 'react-bootstrap';
import List from "./form/List"
import ListKey from './form/ListKey';
import Greeting from './reactDoc/greeting'
import LoginController from './reactDoc/LoginComponent'


/* ReactDOM.render(
  <React.StrictMode>
    <App />
  </React.StrictMode>,
  document.getElementById('root')
);
 */




//Event

//ReactDOM.render(<LoginEvent/>,document.getElementById('root'))

//LifeCycle
//ReactDOM.render(<AddDeleteHook/>,document.getElementById('root'))

//Parent to Child Properties Change  Component LifeCycle Github
//reactDom.render(<ClassProperty1/>,document.getElementById('root'))

//React Forms
//reactDom.render(<ReactForm/>,document.getElementById('root'))

//reactDom.render(<List/>,document.getElementById('root'))

reactDom.render(<Greeting isLogged='false'/>,document.getElementById('root'))
reactDom.render(<LoginController/>,document.getElementById('root'))










//ReactDOM.render(<Toggle />,document.getElementById('root'))

//reactDom.render(<Form/>,document.getElementById('root'));
//ReactDOM.render(<Clock/>,document.getElementById('root'));
//Nested Component
//ReactDOM.render(<Employee name='gopi' empid={101}/>,document.getElementById('root'));

//React Props
//ReactDOM.render(<Employee1 name='gopi' empid={105}/>,document.getElementById('root'));
 //const myfirstelement = <h1>Hello React!</h1>

//ReactDOM.render(<app/> , document.getElementById('root'));



// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
