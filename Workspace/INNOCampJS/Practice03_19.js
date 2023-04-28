// 반복문 문제 2 <while 반복문의 출력값 예상하기>

/*while 반복문이 순차적으로 실행될 때마다 얼럿 창에 어떤 값이 출력될지 예상해보세요.

아래 두 예시는 같은 값을 출력할까요?

    전위형 증가 연산자를 사용한 경우(++i):

    let i = 0;
    while (++i < 5) alert( i );
    후위형 증가 연산자를 사용한 경우(i++):

    let i = 0;
    while (i++ < 5) alert( i );
*/

/*
    정답 : 전위 4까지, 후위 5까지

    이유 : 전위는 해당 비교가 시작 되기 전에 입력되고,
            후위는 해당 비교가 끝나고 입력되기 때문.
 */