const { fstat } = require('fs')
var path=require('path')
var fs=require('fs')
/* fs.mkdir('test',function(err){
    if(err)
        throw err;
        console.log("Directory Created")
})
 */


//console.log(__filename)
console.log(__dirname)
//console.log(__dirname)
//console.log(path.basename(__filename))
//console.log(path.parse(__filename).name)
//console.log(path.extname(__filename))
console.log(path.join(`${__dirname}/test/test.js`));

 fs.writeFile(path.join(`${__dirname}/test/test.js`),'Hi krishna',function(err){
    if(err){
        throw err
    }
    console.log("file created")
})
fs.mkdir('./test/test1',(err) => {
    if(err){
        throw err;
    }
    console.log('Directory Created');
    fs.writeFile(path.join(`${__dirname}/test/test1/test.js`),'Hi krishna',function(err){
        if(err){
            throw err
        }
        console.log("File created")
    })
})
    



 


