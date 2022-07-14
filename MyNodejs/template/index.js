var bodyParser = require('body-parser');
var express=require('express');
var app = express();
//var bodyParser=require('body-parser')
var multer=require('multer');
var upload=multer();
app.set('view engine','pug')
app.set('views','./views')

app.get('/first_template', function(req, res){
    console.log('Server  Started')
    res.render('view',{
        name: 'krishna',
        age:18
    });
 });

app.get('/',function(req,res){
    console.log("Server Started")
    res.render('form')
});

app.use(bodyParser.json());

app.use(bodyParser.urlencoded({extended:true}));
app.use(upload.array());
app.use(express.static('public'));
app.post('/', function(req, res){
    console.log("Hi");
    console.log(req.body);
    res.send("recieved your request!");
 });
 
app.listen(8080) 