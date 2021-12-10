const { query } = require('express');
var express = require('express')
var app = express()
app.get('/',function(req,res)
{
    console.log("Server Running !!!!!");
    res.sendFile(__dirname+'/'+"Express.html");
});

app.get('/home1',function(req,res){
    un=req.query.username;
    mail=req.params.mailid;
    console.log('username'+un);
    console.log(mail);
    res.send('<h1> UserName : '+req.params['username']+'</h1><br><h1>MailID :'+req.query['mailid']+'</h1>');
});



app.listen(8080);
