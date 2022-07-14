const { query } = require('express')
const mysql = require('mysql2')
var conn =require('./Connection')

var con =conn.myConn()
/* var create =con.connect(function(err){
    if(err){
        throw err;
    }
    console.log("Connection")
    var sql="create table customer(name varchar(25),address varchar(100))";
    con.query(sql,function(err,result){
        if(err)
            throw err;
        console.log("Table Created")
    })
})
 */
var insert = con.connect(function(err){
    if(err){
        throw err
    }
    let insert = "insert into customer values ('krishna','chennai')"
    con.query(insert,function(err){
        if(err)
            throw err
        console.log("Record Inserted")
    })

})

var insertMany=con.connect(function (err){
    if(err)
        throw err
    const insertSql="insert into customer values ?";
    var values = [
        ['krishna','chennai'],
        ['raja','chennai'],
        ['prince','chennai']
    ];
    con.query(insertSql,[values],function(err,result){
        if(err)
            throw err
        console.log("Insert Many"+result.affectedRows)
    })
})