import React from "react";
const scaleNames={
    c:'celsious',
    f:'farenhits'
}
function toCelcious(farenhit){
    return (farenhit+32)*9/5;
}
function toFarenhits(celcious){
    return(celcious-5/9)+32
}
function tryConvert(temparature,convert) {
    const input = parseFloat(temparature);
    if(Number.isNaN(input)){

        return '';
    }
    const output=convert(input);
    const rounded = Math.round(output * 1000)/1000;
    return rounded.toString();
    
}
function BoilVerdict(prop){
    if(this.props.celcious>100){
        return <h4>The Water Boiled</h4>
    }
    return <h4>The Water Not BOiled</h4>
}
class TemparatureInput extends React.Component {
    constructor(props) {
      super(props);
      this.handleChange = this.handleChange.bind(this);
    }
  
    handleChange(e) {
      this.props.onTemperatureChange(e.target.value);
    }
  
    render() {
      const temperature = this.props.temperature;
      const scale = this.props.scale;
      return (
        <fieldset>
          <legend>Enter temperature in {scaleNames[scale]}:</legend>
          <input value={temperature}
                 onChange={this.handleChange} />
        </fieldset>
      );
    }
  }
  
class calculator extends React.Component{
    constructor(props){
        super(props)
        this.state={
            temparature:'',
            scale:'c'

        }
        this.handleCelciousChange=this.handleCelciousChange.bind(this);
        this.handleFarenhitChange=this.handleFarenhitChange.bind(this);


    }
    handleCelciousChange(temparature){
        this.state({scale:'c',temparature});
    }
    handleFarenhitChange(temparature){
        this.state({scale:'f',temparature})
    }

        render(){
           const temparature=this.state.temparature;
           const scale=this.state.scale;
           const celcious=scale==='f'?tryConvert(temparature,toCelcious):temparature;
           const farenhits=scale==='c'?tryConvert(temparature,toFarenhits):temparature;

            return(
                <div>
                <TemparatureInput scale='c' onTemparatureChange={this.handleCelciousChange} temparature={celcious}/>
                <TemparatureInput scale='f' onTemparatureChange={this.handleFarenhitChange} temparature={farenhits}/>
                <BoilVerdict celcious={parseFloat(celcious)}/>
                </div>
            )
        }
    
}