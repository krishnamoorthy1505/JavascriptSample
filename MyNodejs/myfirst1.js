const myfunc1=require('./myfirst')
myfunc1.myfunc();
console.log("Number"+myfunc1.num)

const readLine=require('readline');
const r1=readLine.createInterface({
    input : process.stdin,
    output : process.stdout
});
r1.question('what is your name ',(ans) => {
    if(ans==='gopi'){
        r1.close();
    }
    r1.setPrompt('wrong try again \n');
    r1.prompt();
    r1.on('line',(inp) =>{
        if(inp ==='gopi'){
            r1.close();
        }
        else{
            r1.setPrompt(inp+ ' wrong');
        }
    })
    
})
r1.on('close',() => {
    console.log('Close !!!!!!!')
})

var http1=require('http')
http1.createServer(function(req,res)
{
    res.writeHead(200,{'Content-type':'text/plain'});
    res.write("welcome");
    res.end("thank")
}).listen(8080);