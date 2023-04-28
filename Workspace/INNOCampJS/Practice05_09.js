// 객체 순회 문제 1 <프로퍼티 값 더하기>

/* 급여 정보가 저장되어있는 객체 salaries가 있습니다.

Object.values 와 for..of 반복문을 사용해 모든 급여의 합을 반환하는 함수 sumSalaries(salaries)를 만들어보세요.

salaries가 빈 객체라면, 0이 반환되어야 합니다.

예시:

    let salaries = {
      "John": 100,
      "Pete": 300,
      "Mary": 250
    };

    alert( sumSalaries(salaries) ); // 650

*/
function sumSalaries(obj){
    let result = 0;
    for(let i of Object.values(obj)){
        result += i;
    }
    return result;
}

let salaries = {
    "John": 100,
    "Pete": 300,
    "Mary": 250
};

console.log( sumSalaries(salaries) ); // 650