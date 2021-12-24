import { createStore } from 'redux';
import { connect } from 'react-redux'

//current state
let state=[]

//reducer modify state
//current state and action
//previous state combine to new state created
let reducer = (state=[],action) =>{
    if(action.type === "NEW_ORDER"){
        let newState = [...state, action.payLoad];
        return newState;
    }
    return state;
}
//action type,description(action creater)
let action = {type: 'NEW_ORDER', payLoad:'coffee'};
//updated state rducer modify state every time ,modifier state stored in store
let store = createStore(reducer);

store.dispatch(action);
console.log(store.getState());

export default store;