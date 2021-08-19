var Module = Module || {};
(function(_Module){
    var name = "NoName";
    function getName(){
        return name;
    }
    _Module.showName = function(){
        console.log(getName());
    }
    _Module.setName = function(x){
        name = x;
    }
})(Module);


var x = "global x";
(function(){
    var x = "local x"
    var y = "local y"

    console.log(x);
    console.log(y);
})();
console.log(x);

function say(greetings,honorifics){
    console.log(greetings + " " + honorifics + this.name);
}
var tom = {name: "Tom Sawyer"};
var becky = {name:"Becky Thatcher"};

say.apply(tom,["hello!","Mr."]);  //hello! Mr.Tom Sawyer
say.apply(becky,["hi!","ms."]);  //hi! ms.Becky Thatcher
say.call(tom,"Hello","Mr.");  //Hello Mr.Tom Sawyer
say.call(becky,"Hi!","Ms.");  //Hi! Ms.Becky Thatcher

var sayToTom = say.bind(tom);
sayToTom("2: Hello","Mr.");  //2: Hello Mr.Tom Sawyer

function f(x){
    var b = "b";
    return x;
}
var a = {x:1, y:2};
f.p = a;
f.g = function(){
    console.log("g");
}

console.log(f.p);
f.g();

console.log(f);