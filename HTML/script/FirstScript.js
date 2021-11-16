var message = "Hello World";
console.log(message);
var Greetings = /** @class */ (function () {
    function Greetings() {
    }
    Greetings.prototype.m1 = function () {
        console.log("Hi krishnamoorthy");
    };
    return Greetings;
}());
var obj = new Greetings();
obj.m1();
