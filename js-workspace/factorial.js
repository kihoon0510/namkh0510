function fack(n){
    if(n<=1)return n;
    return n*fack(n-1);
}

for(var i=1; i<10; i++){
    console.log(i+"! = "+ fack(i));
    
}

