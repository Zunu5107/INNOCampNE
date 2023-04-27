// 반복문 문제 6 <소수 출력하기>

/*소수(prime number)는 자신보다 작은 두 개의 자연수를 곱하여 만들 수 없는 1보다 큰 자연수입니다.

다시 말해서 1과 그 수 자신 이외의 자연수로는 나눌 수 없는 자연수를 소수라고 부르죠.

5는 2나 3, 4로 나눌 수 없기 때문에 소수입니다. 5를 이들 숫자로 나누면 나머지가 있기 때문이죠.

2부터 n까지의 숫자 중 소수만 출력해주는 코드를 작성해봅시다.

n = 10이라면 결과는 2,3,5,7이 되어야겠죠.

주의: 작성한 코드는 임의의 숫자 n에 대해 동작해야 합니다.
*/

let num = 120;//+prompt("Number", "2");
let tablenum = [];
let cum = [];
let i,j, currentnum;
let count = 0;

for(i = 0; i <= num; i++)
    tablenum.push(true);

for (i = 2;i * i < num; i++) {
    if(tablenum[i]) {
        for(j = i * i; j <= num; j += i) {
            count++;
            //반복을 i * i 부터 시작하는 것은 그 이전의 값은 j이전의 수에서 이미 확인했기 때문
            tablenum[j] = false; //배수이므로 소수가 아닌것으로 만든다.
        }
    }
    count++;
}
for( i = 2; i <= num; i++){
    if(tablenum[i])
        cum.push(i);
}
console.log(cum);
console.log("total : " + count);
