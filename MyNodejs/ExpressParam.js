var express= require('express');
var app=express()
var port=8080;

/* app.get('/:id',function(req,res){
    res.send('id :'+req.params.id);
})
app.get('/:name/:id',function(req,res){
    res.send('id :'+req.params.id + 'name ='+req.params.name);
})
 */
app.get('/things/:id([0-9]{5})',function(req,res){
    res.send("Regular ID"+req.params.id);
})
 
 app.get('/thingss', function(req, res){
    res.send('id: ' + req.params.username +'mailid'+req.params.mailid);
 });
 
/* app.get('*',function(req,res){
    res.send('this is invalid url')
})
 */

app.listen(port,function(req,res){
    console.log("Server Connected");
})
