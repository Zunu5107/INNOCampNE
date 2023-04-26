// 배열과 메서드 문제 9 <배열 요소 무작위로 섞기>

/*
배열의 요소를 무작위로 섞어주는 함수 shuffle(array)을 작성해 보세요.

shuffle을 여러 번 실행하면 요소의 정렬 순서가 달라야 합니다. 예시를 살펴봅시다.

    let arr = [1, 2, 3];

    shuffle(arr);
    // arr = [3, 2, 1]

    shuffle(arr);
    // arr = [2, 1, 3]

    shuffle(arr);
    // arr = [3, 1, 2]
    // ...

문제를 풀 때 주의할 점은 모든 순열이 동일한 확률로 일어나야 한다는 점입니다.
예를 들어 [1,2,3] 은 [1,2,3]이나 [1,3,2], [3,1,2]로 재정렬 될 수 있는데, 이 배열들이 만들어지는 빈도는 같아야 합니다.

*/

function shuffle(array) {
    for (let i = array.length - 1; i > 0; i--) {
        let j = Math.floor(Math.random() * (i + 1));
        [array[i], array[j]] = [array[j], array[i]];
    }
}

let arr = [1, 2, 3];
let count = {
    '123': 0,
    '132': 0,
    '213': 0,
    '231': 0,
    '321': 0,
    '312': 0
};

for (let i = 0; i < 1000000; i++) {
    let array = [1, 2, 3];
    shuffle(array);
    count[array.join('')]++;
}

for (let key in count) {
    alert(`${key}: ${count[key]}`);
}

/*
shuffle(arr);
// arr = [3, 2, 1]

shuffle(arr);
// arr = [2, 1, 3]

shuffle(arr);

*/
