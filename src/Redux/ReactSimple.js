import { createStore } from 'redux';
import { connect } from 'react-redux'


let state=[]

let reducer = (state=[],action) =>{
    if(action.type === "NEW_ORDER"){
        let newState = [...state, action.payLoad];
        return newState;
    }
    return state;
}

let action = {type: 'NEW_ORDER', payLoad:'coffee'};
let store = createStore(reducer);
store.dispatch(action);
console.log(store.getState());

export default store;