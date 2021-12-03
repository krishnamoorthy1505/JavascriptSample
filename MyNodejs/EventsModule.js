const myEvents=require('events');
const myemitter=myEvents.EventEmitter();
myemitter.addListener('my',() =>{
    console.log("Fired");
});
setTimeout(()=>{
    myemitter.emit('my')
},3000);