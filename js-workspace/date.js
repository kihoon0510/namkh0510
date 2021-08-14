var now = new Date();
console.log(now);  //Fri Aug 13 2021 13:56:43 GMT+0900 (한국 표준시)

var then = new Date(2008, 5,10);  
console.log(then); //Tue Jun 10 2008 00:00:00 GMT+0900 (한국 표준시)

var elapsed = now - then;
console.log(elapsed);  //415807003201 Date 객체는 계산식 안에서 밀리초 단위 정수로 값의 타입이 바뀐다.

/* 실행 시간을 측정할 코드를 작성하는 위치 */
var start = new Date();
var end = new Date();
var elapsed = end - start;
console.log(elapsed);

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