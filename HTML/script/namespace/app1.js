var mynamespace;
(function (mynamespace) {
    var mynamespac2;
    (function (mynamespac2) {
        var Nested = /** @class */ (function () {
            function Nested() {
            }
            Nested.prototype.calculateInterest = function (a) {
                return a * 0.50;
            };
            return Nested;
        }());
        mynamespac2.Nested = Nested;
    })(mynamespac2 = mynamespace.mynamespac2 || (mynamespace.mynamespac2 = {}));
})(mynamespace || (mynamespace = {}));
1;
/// <reference path="Invoice.ts" />
var invoice = new mynamespace.mynamespac2.Nested();
console.log(invoice.calculateInterest(100));
/// <reference path="IShape.ts" />
/// <reference path="Circle.ts" />
/// <reference path="Triangle.ts" />
function drawAllShapes(shapes) {
    shapes.draw();
}
drawAllShapes(new Drawing.Circle());
drawAllShapes(new Drawing.Triangle());
