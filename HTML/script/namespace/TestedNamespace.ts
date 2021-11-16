/// <reference path="Invoice.ts" />
var invoice=new mynamespace.mynamespac2.Nested();
console.log(invoice.calculateInterest(100));


/// <reference path="IShape.ts" />
/// <reference path="Circle.ts" />
/// <reference path="Triangle.ts" />

function drawAllShapes(shapes:Drawing.IShape){
    shapes.draw();
}
drawAllShapes(new Drawing.Circle())
drawAllShapes(new Drawing.Triangle())
