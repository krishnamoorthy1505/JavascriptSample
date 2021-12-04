
const readLine=require('readline');
const r1=readLine.createInterface({
    input : process.stdin,
    output : process.stdout
});
r1.question('what is your name ',(ans) => {
    if(ans==='gopi'){
        r1.close();
    } 
    else {
    r1.setPrompt('wrong try again \n');
    r1.prompt();
    r1.on('line', (inp) => {
        if(inp ==='gopi'){
            r1.close();
        }
        else {
            r1.setPrompt(inp+ ' wrong \n');
            r1.prompt();
        }
    })
    } 
})
r1.on('close',() => {
    console.log('Close !!!!!!!')
    
})