// 배열과 메서드 문제 11 <중복 없는 요소 찾아내기>

/*
arr은 배열입니다.

배열 내 유일한 요소를 찾아주는 함수 unique(arr)를 작성해보세요.

예시:
    function unique(arr) {
    /* your code *//*
    }

    let strings = ["Hare", "Krishna", "Hare", "Krishna",
        "Krishna", "Krishna", "Hare", "Hare", ":-O"
    ];

    alert( unique(strings) ); // Hare, Krishna, :-O
*/

function unique(arr) {
    /* your code */
    arr.sort();
    for(let i = 0; i < arr.length; i++)
        arr.splice(i, arr.lastIndexOf(arr[i]) - i);
    return arr;
}

let strings = ["Hare", "Krishna", "Hare", "Krishna",
    "Krishna", "Krishna", "Hare", "Hare", ":-O"
];
unique(strings);
alert( unique(strings) ); // Hare, Krishna, :-O