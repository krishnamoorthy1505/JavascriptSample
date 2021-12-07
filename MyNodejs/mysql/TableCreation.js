var sql=require('mysql2')
var conn=require('./Connection')
var con=conn.myConn();
con.connect(function(err){
    if(err){
        throw err;
    }
    let sql="create table emp(empname varchar(25))";
    con.query(sql,function(err,result){
        if(err){
            throw err;
        }
        console.log("Table Created");
    });
    

})



