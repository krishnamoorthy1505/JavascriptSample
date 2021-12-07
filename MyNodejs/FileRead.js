
var fs = require('fs');

var buf = new Buffer.alloc(1024)
console.log("read")
fs.open('myfirst.js','r+',function(err,fd){
    if(err) {
        throw error
    }
    console.log('File Open Successfully');
    fs.read(fd,buf,0,buf.length,0,function(err,byte){
        if(err){
            console.log(err);
        }
        if(byte>0){
            console.log(buf.slice(0,byte).toString())
        }
    })
    fs.close(fd,function(err){
        if(err){
            throw err;
            
        }
        console.log("File Closed");
    })

    


    
})