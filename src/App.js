import logo from './logo.svg';
import './App.css';
import react from 'react';

class FirstComponent extends react.Component{
  render(){
      return(
        <div className="App">
           <h1>Child First Component</h1>
  
        </div>
     
          )
  }
}
function App() {
  return (
    <div className="App">
      <h1>Parent Component</h1>
      <FirstComponent></FirstComponent>

    </div>
  );
}

export default App;
