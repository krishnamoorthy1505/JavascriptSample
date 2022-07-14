var express = require('express');
var app = express();
var routing = require('./Routing');
app.use('/' , routing);
app.listen(8080);