var fs = require('fs');

fs.readdir('./test',function(err,f){
    if(err){
        throw err;
    }
    f.forEach(function(fi){
        console.log(fi)
    })
})
