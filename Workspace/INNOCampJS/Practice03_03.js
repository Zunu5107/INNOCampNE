// 배열 문제 3 <배열 컨텍스트에서 함수 호출하기>

/*
아래 코드를 실행하면 어떤 결과가 나올까요? 그리고 그 이유는 무엇일까요?

let arr = ["a", "b"];

arr.push(function() {
  alert( this );
})

arr[2](); // ?

*/

// 생각한 답 : a, b, undefined

/*
실제 답 : a, b, function() {
  alert( this );
}
해당 이유 : alert 함수는 문자형만을 받으므로 맨 마지막 배열을 문자열로 변환 출력을 예상합니다.
 */