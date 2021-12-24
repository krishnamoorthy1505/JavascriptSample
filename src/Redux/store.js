 import { createStore } from 'redux'
 import * as redux from 'redux'
 


export const COUNTER_INCREMENT = "counter_increment";
export const COUNTER_DECREMENT = "counter_decrement";

const countinitialState = {
    count : 0 
}

/* const reducer = (state = initialState, action) =>{
    switch(action.type){
        case COUNTER_INCREMENT:{
            return {...state,count : state.count+1}
            break;
        }
        case COUNTER_DECREMENT:{
            return {...state,count : state.count-1}
            break;
        }
        default:{
            return state;
        }
    }
} */
const countreducer = (state = countinitialState, action) =>{
    switch(action.type){
        case COUNTER_INCREMENT:{
            return {...state,count : state.count+1}
            break;
        }
        case COUNTER_DECREMENT:{
            return {...state,count : state.count-1}
            break;
        }
        default:{
            return state;
        }
    }
}
const testreducer = (state = [], action) =>{
    switch(action.type){
        case 'push':{
            const data=[...state]
            //return {...state,count : state.count+1}
            data.push(action.value)
            return [...data]
            break;
        }
        case 'pop':{
            const data = [...state]
            data.pop()
            //return {...state,count : state.count-1}
            return [...data]
            break;
        }
        default:{
            return state;
        }
    }
}

const rootReducer = (state = {},action) => {
    return{
    counter : countreducer(state.counter,action),
    tester : testreducer(state.tester,action)
    }
}
const store=redux.createStore(rootReducer);

//action object
store.dispatch({type:COUNTER_INCREMENT})
export default store
