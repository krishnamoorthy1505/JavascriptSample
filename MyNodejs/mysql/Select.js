const mysql= require("mysql2")
const my=require('./Connection')
var myconn=my.myConn();
myconn.connect(function(err){
    if(err){
        throw err;
    }
    var sql1="select * from customer ";
    myconn.query(sql1,function(err,result,fields){
        if(err){
            throw err;
        }
        console.log("get emp table");
        console.log(result);
    })

})