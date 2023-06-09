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
    return arr.reduce((myarr,item,index) => {
        if(myarr == 0) {
            myarr = [];
            myarr.push(item);
            return myarr;
        }
        let temp = myarr.find(temp => temp == item);
        if( temp == undefined )
            myarr.push(item);
        return myarr;
    }, 0);
}

let strings = ["Hare", "Krishna", "Hare", "Krishna",
    "Krishna", "Krishna", "Hare", "Hare", ":-O"
];
console.log(unique(strings));
//alert( unique(strings) ); // Hare, Krishna, :-O