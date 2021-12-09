import React from "react";

export default class FormText extends React.Component{
    constructor(){
        super()
        this.state={textin:"",
        text1:"",
        fruits:""}

        
        
        this.handleChange=this.handleChange.bind(this);
        this.handleSubmit=this.handleSubmit.bind(this);
    }
    handleChange(event){
        var n=event.target.name;
        var v=event.target.value;
        if(n==="textin"){
            
            //this.setState({[n]:this.state.textin});
            this.setState({[n]:v})

        }
        else if(n==="text1"){
            
            this.text1=v;
            //this.setState({[n]:this.state.text1});
            this.setState({[n]:v})


        }
        else if(n==='fruits'){
            this.setState({[n]:v})

        }
        

    }
     handleTextArea=(event)=>{
        this.setState({text1:event.target.value})
    }
     handleSubmit(event){
        alert("A Name was sumbites"+this.state.textin);
        alert("A Name was sumbites"+this.state.text1);
        alert("A Name was sumbites"+this.state.fruits);



        event.preventDefault();
    }
    render(){
        return(
            
            <form onSubmit={this.handleSubmit}>
               <label> name :<input type="text" name="textin" value={this.state.textin} onChange={this.handleChange}/>
               </label><br/>
                <label>Essay:<textarea name="text1" value={this.state.text1} onChange={this.handleChange}/></label> 

               <br/>
               <label>Fruits :
               <select name="fruits" value={this.state.select} onChange={this.handleChange}>
                    <option value="grapefruit">Grapefruit</option>
                     <option value="lime">Lime</option>
                    <option value="coconut">Coconut</option>
                    <option value="mango">Mango</option>
                </select>
        </label>
                <br/>
               <input type="submit" value="submit"/>
            </form>
            
        )
    }
}