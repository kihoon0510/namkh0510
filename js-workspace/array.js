var evens = new Array(2,4,6,8);
var empty = new Array();
var a = new Array(2,4);
var various = new Array(3.14,"pi",true,{x:1,y:2},[2,4,6,8]);

var x = new Array(3) //인수가 한 개고 그 값이 양의 정수면 인수의 크기만한 길이의 배열 생성


var a2 = ["A","B","C"];
a2[4] = "E";
console.log(a2);  // ["A", "B", "C", empty, "E"]
console.log(a2.length);  // 5 실제 가지고 있는 아이템은 4개
console.log(a2[3]);  //undefined