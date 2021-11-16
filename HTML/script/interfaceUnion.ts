interface i1{
    person:string;

    friends:string[] | string | (()=>string);
}
var list :  i1={
    person:"raja",
    friends:["gopi","krishna"]
};
console.log();
console.log(list.friends[0])
console.log(list.friends[1])
list={
    person:"krishna",
    friends:"moorthy"
};
console.log(list.friends +list.person)

 list ={
     person:"krishna1",
     friends:()=>{
         return "moorthy";
     }

 };
 var funList:any=list.friends;
 console.log(funList()) 
    
