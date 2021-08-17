var a = [2,4,6];
console.log("배열",a,"의 길이는",a.length,"입니다.");  // 배열 [ 2, 4, 6 ] 의 길이는 3 입니다.

// 값을 한 문자열로 연결해서 인수로 넘기면 공백 문자를 빼고 출력할 수 있다.
console.log("배열"+a+"의 길이는"+a.length,"입니다.");  // 배열2,4,6의 길이는3 입니다.  

// 서식 문자열을 사용하여 값을 지정된 서식으로 변환해서 출력할 수 있습니다.
var hename = "Tom";
var height = 172.5;
console.log("그의 이름은 %s 이며 키는 %f cm 이다", hename ,height)  //그의 이름은 Tom 이며 키는 172.5 cm 이다