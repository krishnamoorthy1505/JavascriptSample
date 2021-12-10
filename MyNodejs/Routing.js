var express = require('express')
var router = express.Router();

router.get('/',function(req,res){
    res.sendFile(__dirname + "/" + "Routing.html");
})

router.get('/home',function(req,res){
    res.redirect('https://youtube.com/vjtechnowizard');

})

module.exports = router;