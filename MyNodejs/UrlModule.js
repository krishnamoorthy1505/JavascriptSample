var http = require('http')
var fs = require('fs')
var url = require('url')

http.createServer(function(req,res)
{
    var weblink = url.parse(req.url,true);
    var filePath = "."+weblink.pathname;
    fs.readFile(filePath,function(err,data){
        if(err){
            console.log(404,{'content-type':'text/html'});
            return res.end("404 File not Found");
        }
        res.writeHead(200,{'content-type':'text/html'});
        res.write(data);
        res.end();
    })
}).listen(8080);