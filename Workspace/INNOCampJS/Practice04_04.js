// 함수 문제 4 <pow(x,n) 함수 만들기>

/*x의 n제곱을 반환해주는 함수, pow(x,n)를 만들어보세요. x의 n 제곱은 x를 n번 곱해서 만들 수 있습니다.

    pow(3, 2) = 3 * 3 = 9
    pow(3, 3) = 3 * 3 * 3 = 27
    pow(1, 100) = 1 * 1 * ...* 1 = 1
    프롬프트 대화상자를 띄워 사용자로부터 x와 n을 입력받고 pow(x,n)의 반환 값을 보여주는 코드를 작성해 보세요.
*/
function pow(a, b){
    return Math.pow(a,b);
}

console.log(pow(3,2));
console.log(pow(3,3));
console.log(pow(1,100));