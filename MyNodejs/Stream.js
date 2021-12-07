var stream = require('fs')
var readdata=""
var readFile = stream.createReadStream('./myfirst.js');
readFile.setEncoding("utf8")
readFile.on("data", function(data){
    readdata=data;
})
readFile.on("end", function(){
    console.log(readdata);
})
readFile.on("error",function(err)
{
    console.log("Error"+err.stack)
})
console.log("End of File");


var data="hi krishna";
var outStream = stream.createWriteStream("Myoutput.txt");
outStream.write(data,'utf-8');
outStream.end();
outStream.on("finish", function(){
    console.log("finish");
}
);

outStream.on("error",function(err){
    console.log("Error"+err.stack)
})

