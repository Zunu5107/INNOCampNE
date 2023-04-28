// 메서드와 this 문제 2 <계산기 만들기>

/* calculator라는 객체를 만들고 세 메서드를 구현해 봅시다.

read()에선 프롬프트 창을 띄우고 더할 값 두 개를 입력받습니다. 입력받은 값은 객체의 프로퍼티에 저장합니다.
sum()은 저장된 두 값의 합을 반환합니다.
mul()은 저장된 두 값의 곱을 반환합니다.

let calculator = {
  // ... 여기에 답안 작성 ...
};

calculator.read();
alert( calculator.sum() );
alert( calculator.mul() );

*/
let calculator = {
    x : 0,
    y : 0,
    read(){
        this.x = prompt("첫번째 숫자를 입력하시오.","0");
        this.y = prompt("두번째 숫자를 입력하시오.","0");
    },
    sum(){return +this.x + +this.y},
    mul(){return +this.x * +this.y}
};

calculator.read();
alert( calculator.sum() );
alert( calculator.mul() );