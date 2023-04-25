// 배열 문제 5 <최대합 부분 배열>

/*
입력값은 arr = [1, -2, 3, 4, -9, 6] 같이 숫자로만 구성된 배열이라고 가정해봅시다.

우리가 해야 할 일은 인접한 요소의 총합이 최대인 arr의 부분 배열을 찾는 것입니다.

부분 배열 요소들의 합을 리턴하는 함수 getMaxSubSum(arr)를 작성해 봅시다.

예시:

1. getMaxSubSum([-1,[ 2, 3], -9]) == 5 (강조 표시된 요소들의 합)
2. getMaxSubSum([[2, -1, 2, 3], -9]) == 6
3. getMaxSubSum([-1, 2, 3, -9, [11]]) == 11
4. getMaxSubSum([-2, -1, [1, 2]]) == 3
5. getMaxSubSum([[100], -9, 2, -3, 5]) == 100
6. getMaxSubSum([1, 2, 3]) == 6 (모든 요소)
요소 전체가 음수라면 아무런 요소도 선택하지 않아야 최댓값이 됩니다(부분 배열은 빈 배열). 그리고 합은 0이 됩니다.

7. getMaxSubSum([-1, -2, -3]) = 0;
가능하다면 성능을 고려하여 답안을 작성해 봅시다. 답안은 O(n2) 또는 O(n)까지 가능합니다.

테스트 코드가 담긴 샌드박스를 열어 정답을 작성해보세요.

*/

/*
1. 내 값이 음수면 패스 (확정)
2. 최종값이 음수면 그 다음부터
3. 최종값이 나보다 작으면 안 됨.
 */

function getMaxSubSum(arr) {

    let currentCode = 0; // 다음 이어질 부분
    let result = 0; // 값
    let currentresult = 0; // 현재 최고 값
    let resultFinal = 0; // 최종 값
    let i, j; // 돌아갈 숫자
    let count = 0; // 총 반복문 횟수

    for (i = 0; i < arr.length; i = currentCode) // 배열 시작부분
    {
        currentCode++;
        if( arr[i] < 0 ) continue;
        if( resultFinal < arr[i] ) resultFinal = arr[i];
        result += arr[i];
        for(j = i+1; j < arr.length; j++) // 각 배열마다 더하기
        {
            if(arr[j] < 0 && currentCode == j) currentCode++; // 덧셈 시작 값 다음부터 음수 일 때 음수 제외하기
            result += arr[j];
            if (currentresult < result) currentresult = result;
            if (result < 0)
            {
                currentCode = j + 1;
                break;
            }
        }
        if(resultFinal < currentresult) resultFinal = currentresult;
        if(result > 0)
        {
            if (arr.length == j) break;
        }
        result = 0;
    }
    return(resultFinal);
}

alert( getMaxSubSum([-1, 2, 3, -9]) ); // 5
alert( getMaxSubSum([-1, 2, 3, -9, 11]) ); // 11
alert( getMaxSubSum([-2, -1, 1, 2]) ); // 3
alert( getMaxSubSum([1, 2, 3]) ); // 6
alert( getMaxSubSum([100, -9, 2, -3, 5]) ); // 100
/// 2 -2 -1 100 -2 -1

