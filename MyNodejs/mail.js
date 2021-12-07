process.env.NODE_TLS_REJECT_UNAUTHORIZED='0'

var mail = require('nodemailer')
var sender = mail.createTransport({
    service : 'gmail' ,
    port: 465,
    secure: true,

        auth : {
            user:'krishnamoorthy82@gmail.com',
            pass:'krishna$15'
        }
    
})
var receiver ={
    from:"krishnamoorthy82@gmail.com",
    to:"padmakggg@gmail.com",
    subject: "Hi",
    text: "Hi Padma How Are You"
}
sender.sendMail(receiver,function(err,info)
{
    if(err){
        throw err;
    }
    console.log("Message Sent"+info.response);
})