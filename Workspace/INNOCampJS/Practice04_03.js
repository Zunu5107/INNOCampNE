// 함수 문제 3 <min(a, b) 함수 만들기>

/*a와 b 중 작은 값을 반환해주는 함수, min(a,b)을 만들어보세요.

    만든 함수는 아래와 같이 동작해야 합니다.

        min(2, 5) == 2
        min(3, -1) == -1
        min(1, 1) == 1
*/
function min(a, b){
    return Math.min(a,b);
}

console.log(min(2,5));
console.log(min(3,-1));
console.log(min(1,1));