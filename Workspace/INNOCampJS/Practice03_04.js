// 배열 문제 4 <입력한 숫자의 합 구하기>

/*
아래 조건을 만족하는 함수 sumInput()을 작성해 봅시다.

prompt 창을 띄워 사용자에게 숫자를 입력해 달라고 요청한 후, 입력받은 값들을 배열에 저장합니다.
숫자가 아닌 값, 혹은 빈 문자열을 입력하거나 ‘Cancel’ 버튼을 누르면 질문을 멈춥니다.
배열 요소의 합을 계산하고 리턴합니다.
주의: 숫자 0은 유효한 숫자이므로, 사용자가 0을 입력하더라도 질문이 멈추지 말아야 합니다.

*/
let arr = [];

while (1){
    let temp = prompt("숫자를 입력하세요.","0");

    if(temp == '' || temp === null || temp == ' '){ // 값이 없는 경우 걸러주기
        alert(arr);
        break;
    }

    if(temp > 0 || temp < 0) arr.push(temp); // 0이 아닌 숫자일 때
    else if(temp == 0) {
        if(temp.length > 2){ // 띄어쓰기로 0 만들었을 때
            alert(arr);
            break;
        }
        arr.push(temp);
    }
    else { alert(arr); break; } // 그 외 문자
}