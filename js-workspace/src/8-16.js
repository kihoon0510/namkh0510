function memorize(f){
    var cache = {};
    return function(){
        var key = "";
        for(var i=0; i<arguments.length; i++) key += arguments[i] + ",";
        if(cache[key]==undefined) cache[key]= f.apply(null,arguments);
        return cache[key];
    }
}

var dd ={};
dd["hi"] = "hi2";
dd["by"] = "by2";

console.log(dd);
console.log(dd["hi"]);