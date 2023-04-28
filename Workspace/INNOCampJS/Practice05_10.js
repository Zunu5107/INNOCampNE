// 구조 분해 할당 문제 1 <최대 급여 계산하기>

/* 급여 관련 정보가 저장된 객체 salaries가 있다고 가정해 봅시다.

    let salaries = {
      "John": 100,
      "Pete": 300,
      "Mary": 250
    };

가장 많은 급여를 받는 사람의 이름을 반환해주는 함수 topSalary(salaries)를 만들어봅시다. 조건은 아래와 같습니다.

    * salaries가 비어있으면 함수는 null을 반환해야 합니다.
    * 최대 급여를 받는 사람이 여러 명이라면 그 중 아무나 한 명 반환하면 됩니다.

힌트: Object.entries와 구조 분해를 사용해 키-값 쌍을 순회하는 방식을 사용해보세요.

*/

function topSalary(obj){
    let topC = 0;
    let nameC = null;
    for(let [name, force] of Object.entries(obj)){
        if(topC <= force)
            [nameC, topC] = [name, force];
    }
    return nameC;
}

let salaries = {
    "John": 100,
    "Pete": 300,
    "Mary": 250
};

console.log(topSalary(salaries));