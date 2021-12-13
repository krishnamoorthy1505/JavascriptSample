import React from "react";
import PlayerContent from './PlayerContent'
import PlayerDetail from './PlayerDetail'
import { ReactDOM } from "react";

export default class AppLifeStateUp extends React.Component{
    constructor(props){
        super(props)
        this.state={
            selectedPlayer:[0,0],
            playerName:'' 
        }
        this.updateSelectedPlayer=this.updateSelectedPlayer.bind(this)
    }
    updateSelectedPlayer(id,name){
        var arr=[0,0,0,0]
        arr[id]=1;
        this.setState({
            playerName:name,
            selectedPlayer:arr,
        })
    }
    render(){
        return (
            <div>
                <h4>Lift State Up</h4>
                <PlayerContent active={this.state.selectedPlayer[0]}
                clickHandler={this.updateSelectedPlayer} id={0} name='gopi'></PlayerContent>
                <PlayerContent active={this.state.selectedPlayer[1]}
                clickHandler={this.updateSelectedPlayer} id={1} name='krishna'></PlayerContent>
                <PlayerDetail name={this.state.playerName}></PlayerDetail>
            </div>
        );
    }

}