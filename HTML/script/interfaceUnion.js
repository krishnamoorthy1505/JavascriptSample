var list, i1 = {
    person: "raja",
    friends: ["gopi", "krishna"]
};
console.log(list.person);
console.log(list.friends[0]);
console.log(list.friends[1]);
list = {
    person: "krishna",
    friends: "moorthy"
};
console.log(list.friends + list.person);
list = {
    person: "krishna1",
    friends: function () {
        return "moorthy";
    }
};
var funList = list.friends;
console.log(funList());
