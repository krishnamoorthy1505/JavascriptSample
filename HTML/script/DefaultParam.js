function calculation(price, rate) {
    if (rate === void 0) { rate = 0.50; }
    var cal = price * rate;
    console.log(cal);
}
calculation(20);
calculation(10, 0.30);
