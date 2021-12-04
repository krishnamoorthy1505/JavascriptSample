 /* const myEvents=require('events');
const myemitter=new myEvents.EventEmitter();
myemitter.addListener('my',() =>{
    console.log("Fired");
});
setTimeout(()=>{
    myemitter.emit('my')
},3000);
  */
 const myEvents=require('events');
const myemitter=new myEvents.EventEmitter();
functionHandler  = () => {
    console.log("2")
    console.log("Connection Susccessful")
    console.log("3")
    myemitter.emit('data_received')
}
 myemitter.on("connection",functionHandler);
 myemitter.on("data_received",() =>{
     console.log("4")
    console.log("data Received")
    console.log(5)
 })
 console.log("1")

 myemitter.emit('connection')
 console.log('END') 