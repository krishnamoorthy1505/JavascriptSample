var x=function():string{
    console.log("anonymus without parameter");
    return "Anonymus";
}
console.log(x())

var x1=function(a,b):number{
    return a*b
}
console.log(x1(10,15))

//Function Expression
var myfuction=new Function("a","b","return a*b");
console.log("Function Express"+myfuction(10,20));

//Anonymus Recursive function
(function():void{
    var x="Anonymus Recursive function"
    console.log(x)
})();//() function invoke  itself using paranthess


//lumbado function
var z=(x:number)=>x+10
console.log("lumbdo statement ex="+z(10));

var stat=(x:number)=>{
    x=x+10
    console.log(x)
}
stat(10)

var data=(x)=>{
    if(typeof x=="number"){
        console.log("x is a number")
    }else if(typeof x=="string"){
        console.log("x is a string")
    }
}
    data(10)
    data("string")


    var disp=()=>{
        console.log("jjhkhkhlh")
    }
    disp()
        
    

