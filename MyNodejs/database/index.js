
var mongoose=require('mongodb')

mongoose.connect('mongodb://localhost:27017/mydb');
var personSchema=mongoose.Schema({
    name:String,
    age:Number,
    nationality:String,
})
var Person = mongoose.model("Person",personSchema);
console.log('Connection Created');

/* app.set('view engine','pug')
app.set('views','./views')

app.get('/',function(req,res){
    res.render('person');
}) */