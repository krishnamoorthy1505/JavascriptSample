var event = require('events');
var emitter=new event.EventEmitter();
function listener1(){
    console.log("listener1");
}
function listener2(){
    console.log("listener2");
}
emitter.addListener('connection',listener1);
emitter.on('connection',listener2);

var eventListener = require('events').EventEmitter.listenerCount(emitter,'connection');
console.log(eventListener+" Count the Listener");
emitter.emit('connection')
emitter.removeListener('connection',listener1);
console.log(' Listener will not Listen Listener1');

emitter.emit('connection');

var eventListener1 = require('events').EventEmitter.listenerCount(emitter,'connection');
console.log(eventListener1+" Count the Listener");
console.log("Connection End");


