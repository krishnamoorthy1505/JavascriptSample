const fs=require('fs')
const data=fs.readFileSync("./myfirst.js")
console.log(data.toString())
console.log(' 1 program ended !!!')

fs.readFile('./myfirst.js',(err,data) => {
    if(err)
        console.error('Error'+err)
        console.log("2 \n\n"+data.toString())
        console.log(' 2 program ended !!!')

});

const data1=fs.readFileSync("./myfirst.js")
console.log("3 \n\n"+data1.toString())
console.log('3 program ended !!!')


