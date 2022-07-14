var express = require('express');
var app=express();
var alert=require('alert')
var router=express.Router();

router.use((req,res,next)=>{
    alert('welcome');
    console.log('Requested Method is',req.method,'and',req.url,'URL Page is Running');
    next();
});
app.get('/',(req,res,next)=>{
    console.log('First Page');
    res.send('Go to to Home Page');
    next();
});
app.get('/java',(req,res,next)=>{
    console.log('java Page');
    res.send('Welcome to java Page');
    
});
router.get('/spring',(req,res,next)=>{
    console.log('Spring Page');
    res.send('Welcome to Spring Page');
    
});
router.get('/springboot',(req,res,next)=>{
    console.log('SpringBoot Page');
    res.send('Springboot Page');
    
});
app.use('/java',router);

app.get('*',(req,res,next)=>{
    var err='Page not found';
    next(err);

});
app.use((req,res,err,next)=>{
    console.error(err.stack);
    res.status(500).send("Page not found");
});


/* app.use((req,res,next)=>{
    alert('The End');
    console.log("The End");
}); */



app.listen(8080);