<!-- Output copied to clipboard! -->


<p style="color: red; font-weight: bold">>>>>>  gd2md-html alert:  ERRORs: 0; WARNINGs: 1; ALERTS: 1.</p>
<ul style="color: red; font-weight: bold"><li>See top comment block for details on ERRORs and WARNINGs. <li>In the converted Markdown or HTML, search for inline alerts that start with >>>>>  gd2md-html alert:  for specific instances that need correction.</ul>

<p style="color: red; font-weight: bold">Links to alert messages:</p><a href="#gdcalert1">alert1</a>

<p style="color: red; font-weight: bold">>>>>> PLEASE check and correct alert issues and delete this message and the inline alerts.<hr></p>



# 자바스크립트


## 1장 자바스크립트 개요


### 자바스크립트의 특징



1.  인터프리터 언어
    1. 웹 브라우저에 JIT(Just In Time)컴파일러가 내장되어 있어 실행속도의 단점을 극복
2. 동적 프로토타입 기반 객체 지향 언어
    2. 객체를 생성한 후에도 프로퍼티와 메서드를 동적으로 추가하거나 삭제 할 수 있다.
3. 동적 타입 언어
    3. 변수 타입이 없다, 프로그램을 실행하는 도중에 변수에 저장되는 데이터 타입이 동적으로 바뀔 수 있다.
4. 함수가 일급 객체
    4. 자바스크립트의 함수는 객체다. 함수에 함수를 인수로 넘길 수 있다.
    5. 함수형 프로그래밍 가능
5. 함수가 클로저를 정의
    6. 자바스크립트의 함수는 클로저를 정의한다. 클로저로 변수를 은닉하거나 영속성을 보장하는 등 다양한 기능을 구현할 수 있다.


## 2장 프로그램 작성법


### 주의사항

HTML 요소와 CSS 스타일을 제어하지 않는 순수 자바스크립트 프로그램을 실행시킬 때는 script 요소를 body요소에 배치하는 편이 좋다. 반면 HTML 요소와 CSS 스타일을 제어할 때는 script 요소를 head 요소의 자식 요소로 배치한다. -> 자바스크립트 프로그램과 HTML 문서를 분리하기 위해서이다.


### 공백문자 생략

산술 연산자 앞뒤의 공백 문자 및 괄호 앞뒤, 세미콜론, 쉼표, 콜론 , 마침표 앞뒤의 공백 문자는 생략 가능.

마침표(.)와 괄호([,])앞부분에 공백 문자를 넣으면 코드를 이해하기가 어려워지므로 공백 문자를 반드시 생략한다.


### 문장 



* 복합문(블록문) 중괄호로 감싼 코드 {}
* 빈 문장은 세미콜론으로 작성 ;
* 문장을 작성하고 다음 줄에 문장을 작성하면 앞 문장 끝에 세미콜론이 없어도 자바스크립트 엔진이 자동으로 세미콜론을 추가한다.
* 그러나 세미콜론이 자동으로 추가되는 것을 기대하는 행위는 예상하지 못한 오류의 원인이 된다. 그러므로 문장 끝에는 반드시 세미콜론을 입력한다.
* 주석문 /* 여러줄 가능 */ , // 한줄


## 3장 변수와 값


### 변수

자바스크립트에는 변수 타입이 없으므로 변수 선언자는** var** 하나뿐이다. 따라서 모든 데이터 타입의 값을 저장할 수 있다.


#### 변수 선언 생략

ex)


```
x = 2
console.log(x); // 2 
```


변수를 선언하지 않은 상태에서 값을 대입하면 자바스크립트 엔진이 그 변수를 자동으로 전역 변수로 선언한다. 그러나 변수를 선언하지 않고 변수를 사용하는 행위는 버그의 원인이 될 수 있으므로 반드시 선언후 사용해야 한다.


#### 변수 끌어올림과 변수 중복 선언


```
console.log(x); // undefined
var x = 2
```


오류가 발생하지 않는다. 프로그램 중간에서 변수를 선언하더라도 변수가 프로그램 첫머리에 선언된 것처럼 다른 문장 앞에 생성되기 때문이다. 이것을 변수 선언의 끌어올림이라고 한다.


#### 표기법



* 캐멀 표기법 newName
* 파스칼 표기법 NewName
* 스네이크 표기법 new_name


### 데이터 타입


#### 데이터 타입과 변수의 동적 타이핑

자바스크립트에는 변수에 타입이 없으므로 변수에 모든 타입의 데이터를 저장할 수 있다. 


```
var pi = 3.14;
console.log(pi); //3.14
pi = "원주율"
console.log(pi); //원주율
```


실행할 때 변수에 저장된 데이터 타입을 동적으로 바꿀 수 있는 언어를 **동적 타입 언어**라고 부른다. 자바스크립트는 동적 타입 언어이므로 프로그램을 실행할 때 발생하는 타입 변환에 주의하여 변수에 어떤 타입의 데이터가 저장되는지 잘 확인해야 한다.


#### 데이터 타입의 분류



* 원시 타입(숫자, 문자열, 논리값, 특수한 값, 심벌)
* 객체 타입


#### 숫자

자바스크립트에는 타입이 없으므로 숫자를 모두 64비트(8바이트) 부동소수점으로 표현한다.

배열 인덱스와 비트 연산은 32비트 정수로 처리.

NaN은 0을 0으로 나눈 결과 값, Infinity를  Infinity로 나눈 결과 값, 음수의 제곱근 등 숫자로 표현할 수 없는 부정 값을 표현. 


#### 문자열

자바스크립트의 문자열은 길이가 16비트인 유니코드 문자를 나열한 것으로 전 세계에서 사용하는 문자를 대부분 표현할 수 있다. “나 ‘로 감싸서 사용.

자바스크립트를 HTML 요소에 끼워 넣을 때는 자바스크립트 프로그램을 문자열로 작성.


```
<input type="button" value="Click" onclick="alert('Thanks!')">
```


Thanks! 부분을 작은따옴표로 사용.

HTML 과 자바스크립트에서 사용하는 따옴표를 구분해야 좋다.


#### 특수한 값

값이 없음을 표현하기 위한 특수한 값에는 null 과 undefined가 있다. undefined는 정의되지 않은 상태를 뜻하며 다음 값이 undefined가 된다.



* 값을 아직 할당하지 않은 변수의 값
* 없는 객체의 프로퍼티를 읽으려고 시도했을 때의 값
* 없는 배열의 요소를 읽으려고 시도했을 때의 값
* 아무것도 반환하지 않는 함수가 반환하는 값
* 함수를 호출했을 “때 전달받지 못한 인수의 값

undefined가 되는 것은 값을 할당하지 않은 결과이다.

null은 아무것도 없음을 값으로 표현한 리터럴.


#### 심벌

심벌은 자기 자신을 제외한 그 어떤 값과도 다른 유일무이한 값이다.


```
var sym1 = Symbor();
var sym2 = Symbor.for("club"); //Symbor.for()을 사용하면 문자열과 연결된 심벌을 생성할 수 있다.
console.log(Symbor.keyFor(sym2)); // club
```



#### 템플릿 리터럴

템플릿이란 일부만 변경해서 반복하거나 재사용할 수 있는 틀을 말한다. 템플릿 리터럴을 사용하면 표현식의 값을 문자열에 추가하거나 여러 줄의 문자열을 표현할 수 있다.

역따옴표(`)로 묶은 문자열이다. 

ex) ``I'm going to learn Javascript.` `

줄 바꿈을 할때 이스케이프 시퀀스(\n)을 사용하지 않고 줄바꿈을 할 수 있다.(사용할수도 있음, \n을 표현하고 싶을때는 \\n or String.raw를 사용.


```
var t = String.raw`I'm going to learn\n Javascript.`;
```


String.raw는 태그 함수다.)

ex) 


```
var t = `I'm going to learn
 Javascript.` ;
```


보간 표현식

템플릿 리터럴 안에는 플레이스 홀더를 넣을 수 있다. 플레이스 홀더는 ${ ... }로 표기한다.


```
var a=2, b=3;
console.log(`${a} + ${b} = ${a+b}`); //2 + 3 = 5
```


(플레이스 홀더는 실제 내용물을 나중에삽입할 수 있도록 일단 확보한 장소라는 뜻으로 쓰인다.)

자바스크립트 엔진은 플레이스 홀더 안에 든 부분을 표현식으로 간주하여 평가한다.


## 4장 객체와 배열, 함수의 기초

자바스크립트에서는 원시 타입을 제외한 모든 값이 객체이다. 객체는 객체 리터럴과 생성자로 생성할 수 있다.


### 객체

객체는 이름과 값을 한 쌍으로 묶은 데이터를 여러 개 모은것이다.객체는 데이터 여러 개를 하나로 모은 복합 데이터로 연관 배열 또는 사전이라고도 부른다.

객체에 포함된 데이터 하나를 가리켜 객체의 프로퍼티라고 부른다. 프로퍼티의 이름 부분을 프로퍼티 이름 또는 키라고 부른다.

자바스크립트에서 객체 생성하는 방법은 두 가지다. 



1. 객체 리터럴 사용.
2. 생성자 함수를 사용.


#### 객체 리터럴로 객체 생성하기


```
var card = { suit: "하트", rank: "A"};
card["rank"]; //"A"
card.suit; // "하트"
card.rank; // "A"
```


{ ... } 부분이 객체 리터럴이다.

점 연산자 또는 대괄호 연산자를 사용하여 프로퍼티 값을 읽거나 쓸 수 있다.

대괄호 안에는 문자열로 채워져 있다. 점 연산자로 프로퍼티를 읽거나 쓸 때는 프로퍼티 이름(식별자)만 사용할 수 있다.

객체에 없는 프로퍼티를 읽으려고 시도하면 undefined를 반환한다.

객체 리터럴 안에 어떠한 프로퍼티도 작성하지 않으면 빈 객체가 생성된다.


#### 프로퍼티 추가와 삭제, 조회

없는 프로퍼티 이름에 값을 대입하면 새로운 프로퍼티가 추가된다.


```
console.log(card); //{ suit: "하트", rank: "A"};
card.value = 14; //14
console.log(card); // {suit: "하트", rank: "A", value: 14}
```


delete 연산자를 사용하면 프로퍼티를 삭제할 수 있다.


```
delete card.rank;
console.log(card); // {suit: "하트", value: 14}
```


in 연산자를 사용하면 객체에 특정 프로퍼티가 있는지 확인할 수 있다.


```
console.log("suit" in card);  // true
console.log("color" in card); //false
```


주의할점은 in 연산자가 조사하는 대상이 그객체가 가진 프로퍼티와 그 객체가 상속받은 모든 프로퍼티다.

ex)


```
console.log("toString" in card) //true
```



### 함수의 기초

자바스크립트의 함수는 일련의 처리를 하나로 모아 언제든 호출할 수 있도록 만들어 둔 것이다.

함수의 입력 값을 인수라고 부르고 함수의 출력 값을 반환 값이라고 부른다.

함수는 function 키워드를 사용해서 정의한다. 

ex)


<table>
  <tr>
  </tr>
</table>



```
function square(x){
return x*x; // (return 문 다음에는 줄 바꿈 문자를 넣으면 안된다.)
}
```



#### 함수의 실행 흐름



1. 호출한 코드에 있는 인수가 함수 정의문의 인자에 대입된다.
2. 함수 정의문의 중괄호 안에 작성된 플그램이 순차적으로 실행된다.
3. return 문이 실행되면 호출한 코드로 돌아간다. return 문의 값은 함수의 반환값이 된다.
4. return 문이 실행되지 않은 상태로 마지막 문장이 실행되면, 호출한 코드로 돌아간 후에 undefined가 함수의 반환값이 된다.


#### 함수 선언문의 끌어올림

자바스크립트 엔진은 변수 선언문과 마찬가지로 함수 선언문을 프로그램의 첫머리로 끌어올린다. 함수 선언문은 프로그램의 어떤 위치에도 작성할 수 있고 함수를 정의하기 전에 함수를 실행하는 코드를 작성해도 문제없이 동작한다.


```
console.log(square(5)); // 25
function square(x) {return x*x;}
```



#### 값으로서의 함수

자바스크립트에서는 함수가 객체이다. 함수를 선언하면 내부적으로 그 함수 이름을 변수이름으로 한 변수와 함수 객체가 만들어지고, 그 변수에 함수 객체의 참조가 저장된다.

변수 값을 다른 변수에 할당하면 그 변수 이름으로 함수를 실행할 수 있다.


```
var sq = square;
console.log(sq(5)); // 25
```



#### 참조에 의한 호출과 값에 의한 호출

함수는 원시 값을 인수로 넘겼을 때와 객체를 인수로 넘겼을 때 다르게 동작한다.

인수에 원시 값을 넘기면 그 값 자체가 인자에 전달된다. 이것을 값의 전달이라고 부른다.

원시 값과 인수는 다른 영역의 메모리에 위치한 별개의 값이기 때문에 인수의 값을 변경해도 원시 값은 변하지 않는다.(값을 복사해서 넘김)

그러나 참조에 의한 호출시 인수에 전달되는 값은 참조 값이다. 따라서 함수안에서의 행위는 원래의 객체를 바꿀 수 있다.(객체를 인수로 넘기면 함수에는 객체의 참조가 전달된다.)

전역 변수 - 함수 바깥에서 선언된 변수, 유효 범위가 전체 프로그램

지역 변수 - 함수 안에서 선언된 변수와 함수 인자, 유효 범위는 변수가 선언된 함수 내부

함수 내에서 전역 변수와 지역 변수가 충돌시 지역변수를 사용한다.


#### 함수 안에서의 변수

자바스크립트 엔진은 함수 안의 변수 선언부를 함수의 첫머리로 끌어올린다.

변수를 선언하지 않은 상태에서 값을 대입하면 전역 변수로 선언된다. 함수 바깥에서 발생하지만 함수 안에서도 발생한다. 


#### let 과 const 선언자

블록 유효 범위를 갖는 변수를 선언한다. 블록 유효 범위를 가진 변수는 중괄호 안에서만 유효하다. let 은 변수를 선언하고 const는 한 번만 할당할 수 있는 상수를 선언한다.

자바스크립트 엔진은 let 문으로 선언한 변수를 끌어올리지 않는다.

let문으로 똑같은 이름을 가진 변수를 선언하면 문법 오류가 발생한다.

const 문으로 선언한 상수 값은 수정할 수 없지만, 상수 값이 객체이거나 배열일 경우에는 프로퍼티 또는 프로퍼티 값을 수정할 수 있다.


#### 함수 리터럴로 함수 정의하기

함수는 함수 리터럴로도 정의할 수 있다. 

ex)


```
var square = function(x) { return x*x;};
```


function(x) { … } 부분이 함수 리터털이다.

함수 리터럴은 이름이 없는 함수이므로 익명 함수 또는 무명 함수라고 부른다. 함수 리터럴을 사용할 때는 끝에 반드시 세미콜론을 붙여야 한다. 자바스크립트 엔진이 함수 리터럴로 정의한 함수는 끌어올리지 않는다. 함수 리터럴로 정의한 익명 함수는 변수에 할당한 후에야 이름을 갖게 되고 호출할 수 있다.

익명 함수에도 이름을 붙일 수 있다. 그러나 함수 바깥에서는 호출할 수 없다.


#### 객체의 메서드

객체의 프로퍼티 중에서 함수 객체의 참조를 값으로 담고 있는 프로퍼티를 가리켜 메서드라고 부른다.

메서드 또한 프로퍼티의 일종이므로 나중에 추가할 수 있다.

ex)


```
circle.translate = function(a,b){
	this.center.x = this.center.x + a;
	this.center.y = this.center.y +b;
};
```



### 생성자

생성자를 사용하면 이름이 같은 메서드와 프로퍼티를 가진 객체 여러 개를 효율적으로 생성할 수 있다. 자바스크립트에서는 생성자 함수로 객체를 생성할 수 있다.

ex)


```
function Card(suit, rank){
	this.suit = suit;
	this.rank = rank;
}
var card = new Card("하트","A");  // 생성자로 객체를 생성할 때는 new 연산자를 사용
```


생성자의 이름은 관례적으로 첫 글자를 대문자로 쓰는 파스칼 표기법을 사용한다.

생성자 안에서 this.프로퍼티 이름에 값을 대입하면 그 이름을 가진 프로퍼티에 값이 할당된 객체가 생성된다.

생성자는 함수 이므로 프로퍼티에 값을 대입할 수 있다. 


#### 메서드를 가진 객체를 생성하는 생성자

생성자에서 this.프로퍼티 이름에 함수를 참조를 대입하면 메서드를 정의할 수 있다. 메서드 함수 안에 있는 this는 생성될 인스턴스를 가리킨다.

ex)


```
function Circle(center, radius){
	this.center = center;
	this.radius = radius;
	this.area = function(){
		return Math.PI * this.radius * this.radius;
	};
}
var p = {x:0, y:0};
var c = new Circle(p,2.0);
console.log("넓이 = " + c.area());
```



### 내장 객체


#### Date 생성자 

날짜와 시간을 표현하는 객체를 생성한다.

ex)


```
var now = new Date();
console.log(now);  //Fri Aug 13 2021 13:56:43 GMT+0900 (한국 표준시)

var then = new Date(2008, 5,10);  
console.log(then); //Tue Jun 10 2008 00:00:00 GMT+0900 (한국 표준시)

var elapsed = now - then;
console.log(elapsed);  //415807003201, Date 객체는 계산식 안에서 밀리초 단위 정수로 값의 타입이 바뀐다.

/* 실행 시간을 측정할 코드를 작성하는 위치 */
var start = new Date();
var end = new Date();
var elapsed = end - start;
console.log(elapsed);
```


Date 객체가 제공하는 주요 메서드


```
now.getFullYear(); // 연도를 뜻하는 숫자 값
now.getMonth(); // 월
now.getDate(); // 일
now.getDay(); // 요일을 뜻하는 숫자 값. 0 = 일요일 , 6 = 토요일
now.getHours(); //시각의 시간을 뜻하는 숫자 값
now.getMinutes(); //분
now.getSeconds(); //초
now.getMilliseconds(); //시각의 밀리초
now.toString(); 
now.toLocaleString(); // "yyyy/mm/dd HH.MM.SS" (지역화된 시간과 날짜 정보)
now.toLocaleDateString() // "yyyy.mm.dd."(지역화된)
now.toLocaleTimeString(); // "오후 HH:MM:SS"(지역화된)
now.getUTCHours(); // 협정 세계 시
now.toUTCString(); // (UTC 시간과 날짜 정보)
```



#### Function 생성자

함수를 생성하는 내장 생성자.

ex)


```
var 변수 이름 = new Function(첫 번째 인수, ..., , n번째 인수 , 함수 몸통);
```


Function 생성자로 생성한 함수는 전역 변수와 자신의 지역 변수만 읽고 쓸 수 있다는 단점이 있어서 함수를 동적으로 생성해야 하는 특별한 상황 외에는 사용하지 않는다.

악성 코드를 문자열로 함수 몸통에 전달하면 악성 코드가 실행되어 보안 문제가 발생할 수 있다.

Function 생성자는 함수를 생성하는 기능보다 함수 리터럴에 래퍼객체를 제공한다는 점에 의미를 둔다.


#### 기타 내장 객체



1. 전역 객체
2. JSON
3. Math
4. Reflect


#### 전역 객체

전역 객체는 자바스크립트에서 매우 중요한 객체다. 전역 객체의 프로퍼티는 프로그램의 어느 위치에서나 사용할 수 있다. 자바스크립트 인터프리터 가 시작될 때 혹은 웹 브라우저가 새로운 페이지를 읽어 들일 때마다 새로운 전역 객체가 생성되며 (전역 프로퍼티, 생성자, 전역 함수, 내장 객체)와 같은 프로퍼티를 갖게 된다.


#### 자바스크립트 객체의 분류

자바스크립트 객체는 크게 네이티브 객체, 호스트 객체, 사용자 정의 객체로 나눌 수 있다.

네이티브 객체

ECMAScript 사양에 정의된 객체가 네이티브 객체다. 내장 생성자로 생성된 객체와 JSON, Math, Reflect 등이 네이티브 객체다.

호스트 객체

ECMAScript에는 정의되어 있지 않지만 자바스크립트 실행 환경에 정의된 객체가 호스트 객체다. 브라우저 객체, DOM에 정의되어 있는 객체, Ajax를 위한 XMLHttpRequest 객체, HTML5의 각종 API등이 클라이언트 측 자바스크립트에 정의된 호스트 객체의 예.

사용자 정의 객체 

사용자가 정의한 자바스크립트 코드를 실행한 결과로 생성된 객체가 사용자 정의 객체다.


### 배열의 기초

배열은 객체다.

자바스크립트의 배열은 Array 객체이며 객체로 배열의 기능을 가상으로 흉내 낸 것이다. 

Array 객체는 배열의 인덱스를 문자열로 변환해서 그것을 프로퍼티로 이용한다. 배열의 대괄호 연산자를 사용하는 것은 객체에 대괄호 연산자를 사용하는 것과 마찬가지며 배열의 요소 번호로 숫자 값 대신 문자열을 사용할 수 있다. 

ex)


```
var a = ["A", "B", "C", "D"];
console.log(a["2"]);   // C
a[4] // undefined
```



#### 배열 리터럴로 생성하기

배열 리터럴은 쉼표로 구분한 값을 대괄호로 묶어서 표현

ex)


```
var evens = [ 1,2,3,4];
var empty = [];

var a = [2,,4]  // [2, undefined, 4]

var various = [ 3.14, "pi", true ,{x:1,y:2},[2,4,5,5] ];
```


변수의 요소에는 변수와 마찬가지로 모든 타입의 값이 올 수 있다.


#### length 프로퍼티

자바스크립트에서는 배열 요소의 개수를 뜻하지 않는 경우가 있으므로 주의해야 한다.


```
var a = [1,2,3,4]
a.length = 2;
console.log(a) // [1,2]
```


length 프로퍼티에 현재의 배열 요소 개수보다 작고 0보다 큰 정수 값을 대입하면 배열 길이가 줄어든다. 즉, 그 배열 길이를 넘는 인덱스 번호에 할당된 배열 요소는 삭제된다.


#### Array 생성자로 생성하기

배열은 Array생성자로 생성할 수 있다.

ex)


```
var evens = new Array(2,4,6,8);
var empty = new Array();
var a = new Array(2,4);
var various = new Array(3.14,"pi",true,{x:1,y:2},[2,4,6,8]);

var x = new Array(3) //인수가 한 개고 그 값이 양의 정수면 인수의 크기만한 길이의 배열 생성
```



#### 배열요소의 추가와 삭제

없는 배열 요소에 값을 대입하면 새로운 요소가 추가된다.


```
var a = ["A","B","C"];
a[3] = "D";
console.log(a);  // ["A", "B", "C", "D"]
```


push 메서드를 사용하면 요소를 배열 끝에 추가할 수 있다.


```
var a = ["A","B","C"];
a.push("D");
console.log(a);  // ["A", "B", "C", "D"]
```


delete 연산자를 사용하면 특정 배열 요소를 삭제할 수 있다.


```
delete a[1];
console.log(a);  // ["A", undefined, "C", "D"]
```


delete 연산자를 사용하여 요소를 삭제해도 배열의 length 프로퍼티 값은 바뀌지 않는다. 삭제한 요소만 사라진다.


#### 희소 배열

배열에 요소를 추가하거나 제거하면 인덱스가 0부터 시작되지 않는 배열이 만들어진다. 이러한 배열을 희소 배열이라고 부른다.


```
var a2 = ["A","B","C"];
a2[4] = "E";
console.log(a2);  // ["A", "B", "C", empty, "E"]
console.log(a2.length);  // 5 실제 가지고 있는 아이템은 4개
console.log(a2[3]);  //undefined 실제로는 없음.
```


a2 = {“0”:“A”, “1”:“B”, “2”:”C”, “4”:”D” }

배열 요소가 있는지 확인하기 ex)


```
for(var i in a) console.log(i);  // 0, 1, 2, 4 가 표시
a.hasOwnProperty("3");   // false
a.hasOwnProperty("4");  // true
```


hasOwnProperty 메서드를 사용해서 확인할 수 있다.


## 5장 표현식과 연산자


### 산술 연산


#### 산술 이항 연산자를 쓸때의 주의 사항



1. 정수끼리 나누어도 결과가 부동소수점이 된다.
2. 나머지 연산자 %의 피연산자는 부동소수점이다.
    1. 5%1.5 // 0.5
3. + 연산자는 피연산자 중 하나가 문자열이면 나머지 피연산자를 문자열로 만든다.
4. 계산할 수 없는 경우에는 NaN으로 평가, 산술 연산자의 피연산자가 true면 1, false와 null 이면 0으로 평가한다. undefined면 NaN으로 평가.


#### Math 객체의 프로퍼티

p.136 참고


#### 부동소수점과 정확도 문제

산술 연산을 할 때는 숫자에 유효한 자릿수가 있으므로 계산할 때 오차가 발생한다는 점을 항상 염두에 두어야 한다.


### 문자열 제어하기


#### 문자열을 조작하는 메서드

문자열을 처리하기 위한 객체로 String 객체가 마련되어 있다. 문자열을 String 객체로 변환하려면 String 생성자를 사용한다.


```
var msgObj = new String("Everything is practice.");
```


원시 값을 객체로 변환하는 행위를 가리켜 원시 값을 객체로 래핑 한다고 한다.

p.140 참고

String 객체의 프로퍼티와 메서드는 문자열에서도  사용할 수 있다.

문자열에서 프로퍼티를 사용하려고 하면 문자열이 자동으로 String객체로 변환되기 대문이다.


```
var msgObj = new String(msg);
var c = msgObj.charAt(3);
```


msgObj는 실행하는 순간에 일시적으로 생성되는 String 객체이므로 사용자에게는 보이지 않는다. 처리가 끝나면 곧바로 메모리에서 삭제된다. 이러한 객체를 가리켜 래퍼 객체라고 한다. 자바스크립트에서는 원시 값을 처리할 때 원시 값을 래퍼 객체로 자동 변환한다. 그리고 래퍼 객체의 기능을 활용해서 다양한 작업을 수행한다. 문자열 - String, 숫자 - Number, 논리값 - Boolean 단 null 과 undefined에는 래퍼 객체가 없다.

자바스크립트의 문자열은 불변이다. replace 와 toUpperCase 메서드 등은 새로운 문자열을 반환하며 메서드를 호출한 문자열은 수정하지 않는다.


#### 문자열을 배열로 읽고 쓰기

문자열을 읽을 때는 charAt 메서드 대신 대괄호 연산자를 사용할 수 있다. 


```
msg[3]; // "r"
msg[msg.length-1]; // "."
```


배열처럼 값을 대입해서 수정할 수는 없다.


```
msg[3] = "R"; // 무시당함.
console.log(msg); // Everything is practice. 변함없음.
```



### 논리 연산자와 관계 연산자


#### ==(동일 연산자)

좌우 피연산자의 타입이 같을 때



* 객체 타입 변수의 값이 같은지를 판별하는 행위는 같은 객체를 가리키는지를 판별하는 것가 같다.

좌우 피연산자의 타입이 다를 때



* undefined 와 null 은 같은 것으로 친다.
* 한쪽이 숫자고 다른 한쪽이 문자열이면 문자열을 숫자로 변환해서 비교한다.
* 둘 중에 한쪽이 논리값이면 true는 1, false는 0으로 변환해서 비교
* 한쪽이 객체고 다른 한쪽이 숫자 또는 문자열이면 객체를 toString이나 valueOf 메서드를 사용해서 원시 타입으로 변환한 다음에 비교한다.
* 앞의 규칙에서 벗어나면 모두 같지 않음으로 판정한다.

ex)


```
null == undefined //true
1 == "1" // true
"0xff" == 255 //true
true == 1 //true
true == "1" //true
(new String("a"))=="a" //true
(new Number(2)) == 2 //true
[2] == 2 //true
```



#### ===(일치 연산자) // 값과 타입이 같음

!== // 값과 타입이 다름

일치 연산자는 피연산자를 평가한 후에 타입을 변환하지 않은 상태의 두 값을 엄격하게 비교한다. 타입과 값이 모두 같으면 같다고 판정하고 그렇지 않으면 같지 않다고 판정



* 단, NaN === NaN // false
* NaN !== NaN // true (!==를 만족하는 유일한 값이다.)

ex)


```
null === undefined // false
1 === "1" // false
"0xff" === 255 // false
true === 1 // false
true === "1" // false
(new String("a"))==="a" // false
(new Number(2)) === 2 // false
[2]===2 // false
```



#### 피연산자의 평가

논리 연사자의 피연산자는 논리값이 아니어도 된다. 

0, -0, 빈 문자열(“”), NaN, null, undefined => false

0을 제외한 숫자, 빈 문자열을 제외한 문자열, 모든 객체, 심벌 => true


#### 논리곱 연산자와 논리합 연산자의 단락 평가

논리곱(&&) 연산자와 논리합(||) 연산자는 단락 평가를 한다. 단락 평가란 첫 번째 피연산자 값이 표현식을 결정하면 두 번째 피연산자를 평가하지 않는 것을 말한다. 논리곱 연산자와 논리합 연산자는 논리값 대신에 마지막으로 평가한 피연산자 값을 반환한다.

&& 연산자는 객체의 프로퍼티를 이용할 때와 객체가 null인지 아닌지 확인하고자 할 때 유용하게 사용된다.


```
var p = null;
p && p.name;  // null, p가 false로 평가되므로 p를 반환.
p = {name: "Tom", age :18};
p && p.name  // "Tom", p.name을 반환함.
```


|| 연산자는 여러 개의 값 후보 중에서 null 또는 undefined 가 아닌 값을 선택하고자 할 때 유용하게 사용된다.


```
var time = time_interval || animationSettings.time || 33;
```


앞에 값이 null 일때 뒤로 넘어감


### 비트 연산

비트 논리 연산자 &(비트 논리곱), |(비트 논리합), ^(비트 배타적 논리합), ~(비트 논리 부정)


#### 비트 시프트 연산자

<&lt;(왼쪽 시프트), >>(부호 있는 오른쪽 시프트), >>>(부호 없는 오른쪽 시프트)


### 기타 연산


#### typeof 연산자

typeof 연산자는 단항 연산자이며 피연산자의 데이터 타입을 뜻하는 문자열을 반환한다. 

ex)


```
var s = "ABC";
console.log(typeof s);  // string
```


NaN일 경우 - number

null일 경우 - object

함수 외의 객체 - object

함수 - function


#### eval 함수

문자열을 인수로 받아서 자바스크립트 코드로 해석한다.

문자열을 해석할 수 없을 때는 문법 오류가 발생한다.

ex)


```
var x=1;
evar("x++;"); //x++; 실제 코드와 같다.

var formula = "x*x";
eval("function f(x){ return " + formula +"; }");  /* function f(x){ return x*x; }; 와 같다. */
```


보안에 취약하기에 eval 함수를 사용할 때는 인수의문자열을 분석해서 안전을 확인한 후에 실행해야 한다. 속도도 느리다.


### 명시적 타입 변환


#### Number 객체의 메서드를 활용해 숫자의 타입을 문자열로



* toString(): 인수를 지정하지 않으면 10진수 문자열(인수가 2일경우 2진수)
    * (26).toString(16) // “1a” : 숫자에서 바로 메서드를 사용하고자 할 때는 소괄호로 묶는다.
* toFixed(): 숫자의 소수점 아래 자릿수를 지정한 문자열로 변환한다.
    * var x = 1234.567;
    * x.toFixed(0) // “1235”
    * x.toFixed(2) // “1234.57”
    * x.toFixed(4) // “1234.5670”
* toExponential(): 숫자의 소수점 아래 자릿수를 지정한 문자열로 변환 하되 지수를 함께 표시한다.
    * x.toExponential(3) // ‘1.235e+3”
* toPrecision(): 숫자를 유효 숫자가 지정된 문자열로 변환한다. 단 유효 숫자가 정수부의 자릿수보다 작을 때는 지수로 표시한다.
    * x.toPrecision(3) // “1.23e+3”
    * x.toPrecision(6) // “1234.57”


#### String 함수를 활용하는 방법

String 생성자 앞에 new 연산자를 붙이면 String 객체를 생성하는 함수로 사용할 수 있지만, new 연산자를 붙이지 않으면 일반적인 함수로 활용할 수 있다. String 함수의 반환값은 String 객체가 아닌 문자열이다.

ex) String({x:1, y:2}) // “[object Object]”

String([1, 2, 3]) // “1,2,3”


#### 문자열을 숫자로 변환하기

수식 안에서 묵시적으로 변환


```
var s = "2";
s - 0 // 2
+s  // 2
```


parseInt 와 parseFloat 함수를 사용


```
parseInt("3.14")  // 3
parseFloat("3.14") // 3.14
```


문자열에 숫자 다음에 등장하는 문자열은 무시한다. 문자열 앞부분에 “0x”가 있으면 16진수로 해석, 문자열 앞 부분에 “.” 이 있으면 해석하지 않음 => NaN,

parseInt 함수의 두 번째 인수로 기수를 설정할 수 있다.


```
parseInt("101",2)  // 5
parseInt("ff",16) // 255
```


Number 함수를 활용하는 방법( 모든 데이터 타입을 숫자 타입으로 바꾸는 기능)


```
Number("2.71828") // 2.71828
Number(123) // 123
Number(true) // 1
Number(false) // 0
Number(NaN) //NaN
Number(undefined) //NaN
Number(null) //0
Number({x:1,y:2}) // NaN
Number([1,2,3]) // NaN
```



#### 논리값으로 변환하기



1. !!x
2. Boolean(x)

! 연산자는 논리 타입이 아닌 값의 타입을 논리 타입으로 바꾼다.


## 6장 웹 브라우저에서의 입출력


### 대화 상자

웹 브라우저의 전역 객체인 Window 객체에는 대화상자를 표시하기 위한 메서드가 세 개 있다. 



1. alert: 경고 대화상자를 표시
    1. arlert(“경고할 내용”);
2. prompt: 사용자의 문자열 입력을 받는 대화상자를 표시
    2. var a = prompt(“보여줄 내용”, “내용을 초기화 가능”);
    3. 사용자로 받은 문자열이 반환값
3. confirm: 확인 버튼과 취소 버튼이 있는 대화상자를 표시
    4. var b = confirm(“보여줄 내용”)
    5. 반환값은 true false


### console

Console 객체가 출력하는 값은 프로그램의 동작 확인과 디버깅에 자주 사용되므로 꼭 알아두는게 좋다.

> p.169 Console 객체의 주요 메서드 표 참고


#### 콘솔에 텍스트 출력

문자열이나 변수 값을 콘솔에 로그 로 출력하려면 console.log, console.info, console.warn, console.error 메서드를 사용한다.

Console 객체의 메서드에는 인수 여러 개를 쉼표로 구분해서 넘길 수 있다.


```
var a = [2,4,6];
console.log("배열",a,"의 길이는",a.length,"입니다.");  // 배열 [ 2, 4, 6 ] 의 길이는 3 입니다.

// 값을 한 문자열로 연결해서 인수로 넘기면 공백 문자를 빼고 출력할 수 있다.
console.log("배열"+a+"의 길이는"+a.length,"입니다.");  // 배열2,4,6의 길이는3 입니다.  

// 서식 문자열을 사용하여 값을 지정된 서식으로 변환해서 출력할 수 있습니다.
var hename = "Tom";
var height = 172.5;
console.log("그의 이름은 %s 이며 키는 %f cm 이다", hename ,height)  //그의 이름은 Tom 이며 키는 172.5 cm 이다
```


console.dir 메서드는 객체의 프로퍼티를 나열한다.

console.time 과 console.timeEnd 메서드를 사용해서 특정 코드의 실행 시간을 측정할 수 있다.


### 이벤트 처리

웹 브라우저에서 동작하는 프로그램은 기본적으로 이벤트 주도형 프로그램이다. 

이벤트 주도형 프로그램이란 이벤트가 발생할 때까지 기다렸다가 이벤트가 발생했을 때 미리 등록해 둔 작업을 수행.


#### 이벤트 처리기

이벤트 처리기란 이벤트가 발생했을 때 실행되는 함수를 말한다. 함수를 이벤트가 발생했을 때 동작할 이벤트 처리기로 설정하는 행위를 가리켜 함수를 이벤트의 이벤트 처리기로 등록한다고 한다. 함수를 이벤트 처리기로 등록하는 방법은 세 가지다.



1. HTML 요소의 속성으로 등록하는 방법
    1. &lt;input type = “button” value = “click” <span style="text-decoration:underline;">onclick= “displayTime()”</span>>
2. DOM요소의 프로퍼티로 등록하는 방법
    2. window.onload = function(){ ... }
    3. DOM은 자바스크립트 등의 프로그램이 HTML 요소를 조작할 수 있게 하는 인터페이스다. 
    4. window: Window 객체라고 부르며 웹 브라우저 윈도우 하나 또는 탭 하나를 가리킨다.
    5. document: Document 객체라고 부르며 HTML 문서 전체를 가리킨다. HTML 문서에서 HTML 요소 객체를 가져오거나 HTML 요소를 새로 만드는 등 HTML 문서 전반에 걸친 기능을 제공한다.
    6. 요소객체: HTML 문서의 요소를 가리키는 객체
3. addEventListener 메서드를 사용하는 방법

DOM에서 이벤트 처리기를 등록하는 가장 큰 목적은 HTML 코드와 자바스크립트 코드를 분리하기 위해서이다. DOM을 사용하면 body 요소의 바깥에서 body 요소 안에 있는 HTML 요소를 조작할 수 있다. 

document.getElementById() 메서드를 사용하여 요소 객체를 가져온다.

이벤트 처리기 제거

이벤트 처리기가 등록되어 있지 않은 이벤트 처리기  프로퍼티에는 기본적으로 null이 담겨 있다 그래서 이벤트 처리기 프로퍼티에 등록한 이벤트 처리기를 제거할 때는 단순히 null을 대입한다.

button.onclick = null;


#### 자바스크립트 프로그램의 작성법



1. 자바스크립트 코드는 body 요소 안 HTML 요소에 작성하지 않는다. 모두 head 요소 안 script 요소 안에 작성한다. 
    1. script 요소 안에 직접 코드를 작성하는 방법
    2. 별도 파일로 작성한 코드를 읽어 드리는 방법
    3. 보통은 script 요소 여러 개를 head 요소 안에 배치
2. window.onload에 등록한 함수는 이벤트 처리기의 설정을 비롯한 기타 프로그램의 초기 설정 작업을 수행한다. 이 함수 안에서 등록된 각각의 이벤트 처리기는 해당 이벤트에 반응하여 다양한 작업을 수행한다.
3. window.onload = function() { ... } 를 제외한 코드는 이벤트 처리기 함수와 그 안에서 사용하는 다양한 함수를 정의한다. 또한 필요에 따라서는 전역 변수를 선언하기도 한다. 


#### 타이머

웹 브라우저의 Window 객체에는 setTimeout과 setInterval 메서드가 있다. 이 메서드를 활용하면 지정된 시간이 흐른 후에 함수를 실행하거나 일정한 시간 간격에 따라 함수를 반복 실행할 수 있다.

setTimeout( function(){ console.log(new Date()) , 2000) // 2초가 지난후 function을 실행 (밀리초 단위)

setInterval(function(){ ... }, 1000) // 1초마다 function 반복실행

var timer = setInterval(function() { … }, 1000);

clearInterval(timer);  // 함수 실행이 취소

setTimeout(), setInterval() 의 첫 번째 인수로 문자열을 넘기면 내부적으로 eval()로 평가된 후 실행.


### HTML 요소를 동적으로 읽고 쓰기


#### HTML 요소의 innerHTML 프로퍼티로 읽고 쓰기

요소 객체의 innerHTML 프로퍼티는 그 HTML 요소의 내용을 가리키며 HTML 요소의 내용을 읽거나 쓸 수 있다.

display.innerHTML = ((now-startTime)/1000).toFixed(2);


### Canvas 

> p.187 참고


## 7장 제어 구문

문장은 일반적으로 위에서부터 아래 방향으로 작성한 순서대로 실행되는데 이를 순차적 실행이라고 한다. 순차적 실행 흐름을 변화시키는 문장을 제어 구문이라고 한다. 

자바스크립트에서 사용 가능한 제어 구문



1. 조건문 - if/else, switch, try/catch/finally
2. 반복문 - while, do/while, for, for/in, for/of
3. 점프문 - break, continue, return, throw


### 조건문


#### if/else - 자바와 동일


#### switch

표현식을 평가한 값이 일치하는지를 확인하는 방법은 일치(===) 연산자로 확인하는 방법과 같다.

ex)


```
switch(n){
    case 1:
        console.log("One");
        break;
    case 2:
        console.log("Two");
        break;
    case 3:
        console.log("Three");
        break;
    default:
        console.log("Other");
}
```


C나 Java에서는 case 뒤에 반드시 상수 값을 써야 하지만 자바스크립트에서는 표현식을 그대로 쓸 수 있다. 단, 표현식을 쓰면 알고리즘을 파악하기 어려워질 수 있으므로 숫자 리터럴 또는 문자열 리터럴을 사용하는 편이 좋다.


```
function binaryOperation(a,b,operator){
    switch(operator){
        case "+": return a+b;
        case "-": return a-b;
        case "*": return a*b;
        case "/": return a/b;
        case "%": return a%b;
        case "^": return Math.pow(a,b);
        default: return NaN;
    }
}

console.log(binaryOperation(2,3,"+"));  // 5
```


break 문이나 return 문을 작성하지 않으면 break 문, return 문, switch 블록의 끝을 만날 때까지발견한 모든 문장을 실행한다. 이것은 폴 스루라고 한다. 주로 여러 개의 case 라벨이 가리키는 표현식 결과와 일치하는 실행문을 실행하고자 할 때 사용하는 기법이다.

그러나 폴 스루를 사용하면 알고리즘이 복잡해지는 경우가 많기에 가능하면 쓰지 않는 편이 좋다.

default 라벨은 switch 블록의 어느 위치에 있어도 문법 오류가 발생하지 않는다 다만 default 가 switch 블록 중간에 있으면 가독성이 떨어진다.


### 반복문 


#### while - 자바와 동일


#### do/while

do 문장 while(조건식);

문장을 실행하고 뒤에 조건식을 평가한다. do/while 문 안에 있는 문장은 반드시 한 번 이상 실행된다.


#### for - 자바와 동일


#### for/in

for/in 문은 객체 안의 프로퍼티를 순회하는 반복문이다.

for( 변수 in 객체 표현식) 문장


```
var obj = { a: 1, b: 2, c: 3 }
        for (var p in obj) {
            console.log("obj."+p +" = " + obj[p]);
        }
```


obj.a = 1

obj.b = 2

obj.c = 3


### 점프문

자바스크립트에서 사용할 수 있는 점프문에는 



1. break
2. continue
3. return
4. throw

가 있다.


#### 라벨문

자바스크립트에서는 모든 문장에 라벨을 붙일 수 있다.

> 라벨 이름 : 문장

라벨 이름에는 모든 식별자를 사용할 수 있다. 자바스크립트에서 라벨로 점프할 수 있는 문장은 break 문과 continue 문 뿐이다. break문은 switch 문과 반복문 안에서만 사용할 수 있고 continue 문은 반복문 안에서만 사용할 수 있다.

ex)


```
loop : while(true){
		...
            if(confirm("exit?")) break loop;
		...
        }
```



#### break 문

break 문에는 점프할 라벨을 지정할 수 있다.

break 라벨 이름;

라벨을 지정한 break 문을 실행하면 라벨이 붙은 문장 끝으로 점프한다.

break 문과 라벨 이름 사이에는 줄 바꿈 문자를 넣지 않도록 주의해야 한다.( 줄 바꿈 문자를 넣으면 자바스크립트 엔진이 내부적으로 세미콜론을 추가하므로 라벨을 지정하지 않은 break문으로 해석한다.)


#### continue 문

continue 문에도 점프할 라벨을 지정할 수 있다.

continue 문은 라벨 지정 여부와 관계없이 반복문 안에서만 사용할 수 있다.


## 8장 함수


### 함수 정의

함수를 정의하는 방법은 네 가지다.



1. 함수 선언문으로 정의하는 방법
    1. function square(x) { return x*x; }
2. 함수 리터럴로 정의하는 방법
    2. var square = function(x) { return x*x; };
3. Function 생성자로 정의하는 방법
    3. var square = new Function(“x”,”return x*x”);
4. 화살표 함수 표현식으로 정의하는 방법
    4. var square = x =>x*x; // 화살표 함수 표현식은 ECMAScript 6부터 추가된 요소

자바스크립트엔진은 함수 선언문을 프로그램의 첫머리 또는 함수의 첫 머리로 끌어올린다.

그러나, 함수 리터럴, Function 생성자, 화살표 함수 표현식으로 정의한 함수는 변수에 그 함수의 참조를 할당해야 비로소 사용할 수 있는 상태가 된다. 그러므로 이 세 가지 방법으로 함수를 정의하는 코드는 호출하는 코드보다 앞에 위치해야 한다.


#### 중첩 함수 

특정 함수의 내부에 선언된 함수를 가리켜 그 함수의 중첩 함수라고 한다. 중첩 함수를 지역 함수 또는 내부 함수라고 부르기도 한다.(중첩 함수가 올바른 표현) C나 Java 에서는 중첩 함수를 사용할 수 없다. 자바스크립트에서는 외부 함수의 최상위 레벨에만 중첩 함수를 작성할 수있다. 함수 안의 if 문과 while 문 등의 문장 블록 안에는 중첩 함수를 작성할 수 없다.

중첩 함수의 참조는 그 중첩 함수를 둘러싼 외부 함수의 지역 변수에 저장되므로 외부 함수의 바깥에서는 일거나 쓸 수 없다. 외부 함수의 변수 유효 범위가 그 함수의 중첩 함수에까지 미친다는 규칙은 클로저의 핵심적인 구성 요소다.


### 함수 호출

함수를 호출하는 방법은 네 가지다.



1. 함수 호출 - 함수의 참조가 저장된 변수 뒤에 그룹 연산자()를 붙여서 함수를 호출.
    1. var s = square(5);
2. 메서드 호출 - 메서드를 호출할 때는 그룹 연산자인()를 붙여서 호출, 1번과 동일
    2. obj.m = function() { … };
    3. obj.m();
3. 생성자 호출
    4. var obj = new Object();
4. call, apply를 사용한 간접 호출
    5. 함수의 call과 apply 메서드를 사용하면 함수를 간접적으로 호출할 수 있다.


#### 즉시 실행 함수

일반적으로 익명 함수를 실행할 때는 익명 함수의 참조를 변수에 할당한 후에 그룹 연산자()를 붙여서 실행한다. 자바스크립트에는 익명 함수를 정의하고 곧바로 실행하는 즉시 실행 함수 라는 구문이 있다.



1. (function() { … })();

익명 함수를 정의하는 동시에 실행할 수 있다.



2. (function() { … }()); - 두 번째 방법 (비추), 그룹 연산자인 ()로 묶으면 괄호 안의 함수 정의식이 평가되어 함수 값으로 바뀐다.

함수 실행 결과를 변수에 할당할 수 있으며 표현식 안에서 사용할 수 있다.

즉시 실행 함수는 전역 유효 범위를 오염시키지 않는 이름 공간을 생성할 때 사용한다.


### 함수의 인수

자바스크립트에서는 함수를 호출할 때 인수를 생략할 수 있다. 반대로 함수 정의식에 작성된 인자 개수보다 더 많은 개수의 인수를 넘겨서 함수를 실행할 수 있다.


#### 인수의 생략

함수 정의식에 작성된 인자 개수보다 인수를 적게 전달해서 함수를 실행하면 인수에서 생략한 인자는 undefined가 된다.


```
function f(x, y){
	console.log("x = " + x+", y = "+y);
}
f(2);	// x = 2, y = undefined
```



#### 가변 길이 인수 목록

모든 함수에서 사용할 수 있는 지역 변수로는 arguments 변수가 있다. arguments 변수의 값은 Arguments 객체다. 함수에 인수를 n개 넘겨서 호출하면 이수 값이 다음과 같이 arguments에 저장된다. 

arguments[0] : 첫 번째 인수 값

arguments[1] : 두 번째 인수 값

.

.

arguments[n-1] : n 번째 인수 값

arguments.length : 인수 개수

arguments.callee : 현재 실행되고 있는 함수의 참조

Arguments 객체는 유사 배열 객체다.

arguments 변수를 활용하면 인수 개수가 일정하지 않은 가변 인수 함수를 정의할 수 있다.


#### 재귀 함수

함수 리터럴 표현식에서 재귀 함수를 사용하려면 함수 이름을 적어야 한다.


```
var fact = function f(x){
	if(n<=1) return 1;
	return n*f(n-1);
}
```


함수 이름 f는 함수 안에서만 유효하다.

arguments.callee를 사용하면 익명 함수도 재귀 호출을 할 수 있다.


```
var fact = function(n){
	if(n<=1) return 1;
	return n*arguments.callee(n-1);
}
```


arguments.callee가 지금 실행 중인 함수를 가리킨다.

재귀 함수를 정의할 때의 주의 사항



1. 재귀 호출은 반드시 멈춰야 한다. - 무한루프에 빠질 수 있다.
2. 재귀 호출로 문제를 간단하게 해결할 수 있을 때만 사용한다.
    1. 호출된 각각의 재귀 함수는 메모리의 다른 영역을 사용한다. 따라서 호출된 횟수만큼 메모리 소비량이 늘어난다. 


### 프로그램의 평가와 실행 과정


#### 실행 가능한 코드

자바스크립트 엔진은 실행 가능한 코드를 만나면 그 코드를 평가 해서 실행 문맥으로 만든다.

실행 가능한 코드의 유형은



1. 전역 코드
    1. Window 아래에 정의된 함수
2. 함수 코드
3. eval 코드

이다.

자바스크립트 엔진이 실행 가능한 코드의 유형을 분류하는 이유는 실행 문맥을 초기화하는 환경과 과정이 다르기 때문이다.


#### 실행 문맥의 구성

실행 문맥은 실행 가능한 코드가 실제로 실행되고 관리되는 영역으로 실행에 필요한 모든 정보를 컴포넌트 여러 개가 나누어 관리하도록 만들어져 있다. 

가장 중요한 컴포넌트



1. 렉시컬 환경 컴포넌트
2. 변수 환경 컴포넌트
3. 디스 바인딩 컴포넌트
    1. 함수를 호출한 객체의 참조가 저장되는 곳. 이것이 가리키는 값이 곧 해당 실행 문맥의 this가 된다.





#### 렉시컬 환경 컴포넌트의 구성

실행 문맥의 구성 요소인 렉시컬 환경 컴포넌트는 자바스크립트 엔진이 자바스크립트 코드를 실행하기 위해 자원을 모아 둔 곳으로 구체적으로는 함수 또는 블록의 유효 범위 안에 있는 식별자와 그 결과 값이 저장되는 곳이다. 자바스크립트 엔진은 해당 자바스크립트 코드의 유효 범위 안에 있는 식별자와 그 식별자가 가리키는 값을 키와 값의 쌍으로 바인드해서 렉시컬 환경 컴포넌트에 기록한다.

렉시컬 환경 컴포넌트는 



1. 환경 레코드 
    1. 환경 레코드는 유효 범위 안에 포함된 식별자를 기록하고 실행하는 영역으로 ECMAScript 3의 변수 객체와 매우 비슷한 역할을 한다.자바스크립트 엔진은 유효 범위 안의 식별자와 결과 값을 바인드해서 환경 레코드에 기록한다.
2. 외부 렉시컬 환경 참조
    1. 함수를 둘러싸고 있는 코드가 속한 렉시컬 환경 컴포넌트의 참조가 저장된다. 자바스크립트 엔진은 외부 렉시컬 환경 참조를 따라 한 단계씩 렉시컬 환경을 거슬러 올라가서 그 변수를 검색한다.

로 구성되어 있다.


#### 환경 레코드의 구성

렉시컬 환경 컴포넌트의 구성 요소인 환경 레코드는 렉시컬 환경 안의 식별자와 그 식별자가 가리키는 값의 묶음이 실제로 저장되는 영역이다. 



1. 선언적 환경 레코드
    1. 함수와 변수, catch 문의 식별자와 실행 결과가 저장되는 영역
2. 객체 환경 레코드
    1. 실행 문맥 외부에 별도로 저장된 객체의 참조에서 데이터를 읽거나 쓴다.
    2. with 문의 렉시컬 환경이나 전역 객체처럼 별도의 객체에 저장된 데이터는 그 개체가 가진 키와 값의 쌍을 복해 오는 것이 아니라 그 객체 전체의 참조를 가져와서 객체 환경 레코드 bindObject라는 프로퍼티에 바인드하도록 만들어져 있다.

저장하는 값의 유형에 따라 쓰임새가 달라진다.


#### 전역 환경과 전역 객체의 생성

자바스크립트 인터프리터는 시작하자마자 <span style="text-decoration:underline;">렉시컬 환경 타입</span>의 <span style="text-decoration:underline;">전역 환경</span>을 생성한다.

그리고 <span style="text-decoration:underline;">전역 객체</span>를 생성한 다음 <span style="text-decoration:underline;">전역 환경</span>의 <span style="text-decoration:underline;">객체 환경 레코드</span>에 <span style="text-decoration:underline;">전역 객체</span>의 참조를 대입한다.

웹 브라우저의 자바스크립트 실행 환경에서는 Window 객체가 전역 객체이므로 객체 환경 레코드의 bindObject 프로퍼티에는 전역 객체 Window의 참조가 할당된다.

이로 인해 전역 환경의 변수와 함수를 Window 안에서 검색하게 된다.

전역환경의 외부에는 다른 렉시컬 환경이 없으므로 외부 렉시컬 환경 참조에는 null을 할당한다.

전역 실행 문맥의 디스 바인딩 컴포넌트에도 Window의 참조가 할당되어 전역 실행 문맥의 this가 Window를 가리키게 되고, 전역 실행 문맥의 프로퍼티를 디스 바인딩 컴포넌트 안에서 검색하게 된다.


#### 프로그램의 평가와 전역 변수

전역 환경과 전역 객체를 생성한 후에는 자바스크립트 프로그램을 읽어 들인다.

자바스크립트 프로그램을 다 읽어 들인 후에는 프로그램을 평가하며, 최상위 레벨에 var 문으로 작성한 전역 변수는 전역 환경의 환경 레코드(객체 환경 레코드)의 프로퍼티로 추가된다.

자바스크립트 엔진은 전역 코드를 평가할 때 최상위 레벨에 var 문으로 작성한 전역 변수를 전역 환경의 환경 레코드(개체 환경 레코드)에 프로퍼티로 기록한다. 프로퍼티 이름은 식별자 이름이 되고 프로퍼티 값은 undefined가 된다. 함수의 경우에는 최상위 레벨에 작성된 함수 선언문을 함수 개체로 생성해서 전역 환경의 환경 레코드(객체 환경 레코드)에 프로퍼티로 기록한다. 

> 최상위 레벨에 선언된 변수와 함수는 프로그램을 평가할 때 객체 환경 레코드에 기록된다.  

전역 변수의 실체는 전역 객체의 프로퍼티 또는 전역 객체의 실행 문맥에 들어 있는 환경 레코드(객체 환경 레코드)의 프로퍼티이다.


```
var a = {x:1, y:2};
console.log(window.a);  //{x: 1, y: 2}
```


최상위 레벨에 선언된 변수와 함수는 프로그램을 평가하는 시점에 환경 레코드에 추가된다. 최상위 레벨에 선언된 함수와 변수는 프로그램을 평가하는 단계에 이미 객체 환경 레코드에 추가된 상태이기 때문에 코드의 어느 위치에 작성해도 전체 프로그램이 참조할 수 있다.

=> 끌어올림


#### 프로그램 실행과 실행 문맥