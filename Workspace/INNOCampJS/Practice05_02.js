// 객체 문제 2 <객체가 비어있는지 확인하기>

/* 객체에 프로퍼티가 하나도 없는 경우 true, 그렇지 않은 경우 false를 반환해주는 함수 isEmpty(obj)를 만들어 보세요.

아래와 같이 동작해야 합니다.

    let schedule = {};

    alert( isEmpty(schedule) ); // true

    schedule["8:30"] = "get up";

    alert( isEmpty(schedule) ); // false
*/
function isEmpty(obj){
    for(let i in obj){
        return false;
    }
    return true;
}

let schedule = {};

console.log( isEmpty(schedule) ); // true

schedule["8:30"] = "get up";

console.log( isEmpty(schedule) ); // false