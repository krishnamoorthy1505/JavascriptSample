var express = require('express');
var app=express();
var alert=require('alert')

app.use((req,res,next)=>{
    alert('welcome');
    console.log('Requested Method is',req.method,'and',req.url,'URL Page is Running');
    next();
});
app.get('/',(req,res,next)=>{
    console.log('First Page');
    res.send('Welcome to First Page');
    next();
});
app.get('/second',(req,res,next)=>{
    console.log('Second Page');
    res.send('Welcome to Second Page');
    next();
});
app.use((req,res,next)=>{
    alert('The End');
    console.log("The End");
});



app.listen(8080);