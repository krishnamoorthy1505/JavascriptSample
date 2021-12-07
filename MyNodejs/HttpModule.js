var http=require('http')
var fs=require('fs');

http.createServer(
    function(req,res){
        //res.writeHead(200,{'content-type':'text/plain'})
        fs.readFile('./read.txt',function(err,data)
        {
            if(err){
                throw err;
            }
            res.write(data);
            res.end();

        });
        //res.end("END");
    }).listen(8080);