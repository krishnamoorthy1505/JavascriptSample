var g1 = 10; //global
var Scope = /** @class */ (function () {
    function Scope() {
        this.n1 = 100;//class
    }
    Scope.prototype.svopeVariable = function () {
        var loc_var = 10000;//local
    };
    Scope.sval = 1000;//static
    return Scope;
}());
console.log(g1);
console.log("Static =" + Scope.sval);
//console.log("Class variable"+Scope.n1);
var obi = new Scope();
obi.svopeVariable();
console.log("Class variable" + obi.n1);
