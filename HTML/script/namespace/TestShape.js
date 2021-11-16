/// <reference path="IShape.ts" />
/// <reference path="Circle.ts" />
/// <reference path="Triangle.ts" />
function drawAllShapes(shapes) {
    shapes.draw();
}
drawAllShapes(new Drawing.Circle());
drawAllShapes(new Drawing.Triangle());
