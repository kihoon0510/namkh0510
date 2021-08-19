function partial(f){
    var args = arguments;
    for(var i=0; i<args.length;i++) console.log(args[i]);
    return function(){
        var a = Array.prototype.slice.call(args,1);
        for(var i=0,j=0;i<a.length;i++){
            if(a[i] == undefined)a[i] = arguments[j++];
        }
        return f.apply(this,a);
    }
}

var square = partial(Math.pow, undefined, 2);
var sqrt = partial(Math.pow, undefined, .5);
var cubicroot = partial(Math.pow, undefined, 1/3);
var exp = partial(Math.pow, Math.E, undefined);

var pow = function(exponent){
    return function(base){
        return Math.pow(base,exponent)
    }
}
Math.pow(base, exponent) = pow(exponent)(base)