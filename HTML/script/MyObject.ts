var myObj1={
    firstName:"krishna",
    lastName:"moorthy",
    hai:function(){}

}
myObj1.hai=function(){
    console.log(myObj1.firstName+" "+myObj1.lastName+" "+myObj1.hai());
}

var myobj2={
    contact:999999,
    place:"ttttt"
};

//object  with function
var invokeobj=function(obj:{contact:number,place:string}){
    console.log(obj.contact)
    console.log(obj.place)
}
invokeobj(myobj2)

var invokeAno=function(obj:{place:string}){
    console.log(obj.place);
}
invokeAno({place:"chennai"})