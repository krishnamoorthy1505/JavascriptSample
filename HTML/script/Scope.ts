var g1:number=10
class Scope{
     n1:number=100;
     static sval=1000;
     svopeVariable():void{
        var loc_var=10000;
     }


}
console.log(g1);
console.log("Static ="+Scope.sval);
//console.log("Class variable"+Scope.n1);
var obi=new Scope();
obi.svopeVariable();
console.log("Class variable"+obi.n1);
