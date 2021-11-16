var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var Class1 = /** @class */ (function () {
    function Class1(name) {
        this.name = name;
    }
    return Class1;
}());
var Class2 = /** @class */ (function (_super) {
    __extends(Class2, _super);
    function Class2() {
        var _this = _super !== null && _super.apply(this, arguments) || this;
        _this.age = 15;
        return _this;
    }
    Class2.prototype.disp = function () {
        console.log("name" + this.name + "age=" + this.age);
    };
    return Class2;
}(Class1));
var myObj = new Class2("moorthy");
myObj.disp();
