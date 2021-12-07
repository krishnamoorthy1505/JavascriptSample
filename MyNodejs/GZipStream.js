var zlip = require('zlib');
var fs = require("fs");

readStream=fs.createReadStream('./myfirst.js').pipe(zlip.createGzip()).pipe(fs.createWriteStream('MyOutput.txt.gz'));

console.log("File Compressed");

readStream=fs.createReadStream('./MyOutput.txt.gz').pipe(zlip.createGzip()).pipe(fs.createWriteStream('Myoutput1.txt'));
console.log("UNZip file")