import logo from './logo.svg';
import './App.css';
import react from 'react';

class FirstComponent extends react.Component{
  render(){
      return(
        <div className="App">
          <SecondComponent></SecondComponent>
           <h1>Child First Component</h1>
  
        </div>
     
          )
  }
}
class SecondComponent extends react.Component{
  render(){
      return(
        <div className="App">
           <h1>Child Second Component</h1>
            <Third></Third>
        </div>
     
          )
  }
}

function Third(){
  return(
    <h1>Third Function based component</h1>
  )
}
//Parent
function App() {
  return (
    <div className="App">
      <h1>Parent Component</h1>
      <FirstComponent></FirstComponent>

    </div>
  );
}

export default App;
