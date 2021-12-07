var sql=require('mysql2');

module.exports.myConn=function(){
    var con = sql.createConnection({
        host:'127.0.0.1',
        port: 3307,
        user: 'root',
        password: 'root',
        database: 'nodedb'
        
    });
    con.connect((err)=>{
        if(err){
            throw err;
        }
        console.log("Connection Created")
/*         con.query('create database nodeDb',function(err){
            if(err){
                throw err;
            }
            console.log("DATABASE CREATED");
         })*/
    })
    return con;
}
