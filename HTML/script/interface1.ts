interface person{
    firstName:string,
    lastName:string,
    saiHi:()=>string

}
var i:person={
    firstName:"krishna",
    lastName:"moorthy",
    saiHi:():string=>{
        return "saiHi"
    }

}
console.log(i.firstName +" lastname="+i.lastName+"Sai="+i.saiHi())

interface i1{
    name:string
}
interface i2 extends i1 {
    place:string

    
}
var i4=<i2>{};
console.log(i4.name="krish")
console.log(i4.place="chennai")
