let name="Krish"
function greetings(){
    let message="hi";
    console.log(message +" "+name);
}
greetings();

function greeting1(){
    let message="Hello"
    function saiHi(){
        console.log(message);
    }
    saiHi()
}
greeting1();

function greeting2(){
    let message="Hello"
    console.log("Greeting 2 hi")
    function saiHi(){
        console.log(message);
    }
    return saiHi
}
let hi=greeting2();
hi(); // still can access the message variable


function greeting3(message){
    return function(value){
        return message+" "+value;

    }
}
a=greeting3("Hi")
b=greeting3("heloo");
console.log(a("krishna"))
console.log(b("krishna"))


