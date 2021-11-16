class Class1{
    name:string;
    constructor(name:string){
        this.name=name;
    }
}
class Class2 extends Class1{
    age:number=15

    disp():void{
        console.log("name"+this.name+"age="+this.age);
    }
}

var myObj=new Class2("moorthy");
myObj.disp();