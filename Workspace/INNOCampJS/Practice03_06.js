// 배열과 메서드 문제 1 <border-left-width를 borderLeftWidth로 변경하기>

/*

"my-short-string"같이 여러 단어를 대시(-)로 구분한 문자열을 카멜 표기법을 사용한 문자열 "myShortString"로 변경해주는 함수를 작성해보세요.

대시는 모두 지우고 각 단어의 첫 번째 글자는 대문자로 써주면 됩니다.

예시:

1. camelize("background-color") == 'backgroundColor';
2. camelize("list-style-image") == 'listStyleImage';
3. camelize("-webkit-transition") == 'WebkitTransition';
힌트: split을 사용해 문자열을 배열로 바꾼 다음 join을 사용해 다시 합치면 됩니다


 */
/* 1회차
function camelize(str){
    let arr = str.split("-");
    arr.forEach((item, index, array) =>{ if(index != 0) array[index] = item[0].toUpperCase() + item.slice(1);});
    return arr.join("");
}
*/

function camelize(str){
    return str.split("-").map((item,index,array) => (index <= 0) ? item : item[0].toUpperCase() + item.slice(1)).join("");
}

alert(camelize("background-color"));
alert(camelize("list-style-image"));
alert(camelize("-webkit-transition"));