function outer(){
    var i=0;
    var arr=[];
    for(i=0;i<5;i++){
        arr[i]=function(){
            return i;
        }
    }
    return arr;

}

    var a1=outer();
    for(var j=0;j<5;j++)
    console.log(a1[j]())

    function outer1(){
        function callArr(val){
            return function(){
                return val;
            }
        }
        var i=0;
        var arr=[];
        for(i=0;i<5;i++){
            arr[i]=callArr(i)
                
            }
        
        return arr;
    
    }
    var a1=outer1();
    for(var j=0;j<5;j++)
    console.log(a1[j]())

    
    
