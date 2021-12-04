const myfunc1=require('./myfirst')
myfunc1.myfunc();
console.log("Number"+myfunc1.num)


var http1=require('http')
http1.createServer(function(req,res)
{
    res.writeHead(200,{'Content-type':'text/plain'});
    res.write("welcome");
    res.end("thank")
}).listen(8080);