function restParam(...nums:number[]){
var i;
var sum:number=0;
for(i=0;i<nums.length;i++){
   sum=sum+ nums[i];
}
console.log("sum="+sum)
}
restParam(10,20,30)
restParam(10,10,20,30,40,50)