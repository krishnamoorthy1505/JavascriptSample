var m=10
if(m<=0 || m>=0){
    m=Number.NaN;
    console.log("Not a number"+m)
}
else{
    console.log("Is a number="+m)
}

//Prototype
//
function f1(a:number,b:number){
    this.a=a;
    this.b=b;
}
var d=new f1(1,2);
f1.prototype.email="gopi@gmail.com"

console.log(d.a)
console.log(d.b)
console.log(d.email)