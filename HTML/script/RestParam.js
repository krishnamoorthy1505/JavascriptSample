function restParam() {
    var nums = [];
    for (var _i = 0; _i < arguments.length; _i++) {
        nums[_i] = arguments[_i];
    }
    var i;
    var sum = 0;
    for (i = 0; i < nums.length; i++) {
        sum = sum + nums[i];
    }
    console.log("sum=" + sum);
}
restParam(10, 20, 30);
restParam(10, 10, 20, 30, 40, 50);
