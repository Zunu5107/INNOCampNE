// 배열과 메서드 문제 8 <객체 매핑하기>

/*
세 개의 프로퍼티 name과 surname, id를 가진 객체 user가 담긴 배열이 있습니다.

name과 surname을 조합해 fullName을 만들고, 이를 이용해 두 개의 프로퍼티 id와 fullName을 가진 객체를 담은 새로운 배열을 반환해주는 코드를 작성해보세요.

예시:

    let john = { name: "John", surname: "Smith", id: 1 };
    let pete = { name: "Pete", surname: "Hunt", id: 2 };
    let mary = { name: "Mary", surname: "Key", id: 3 };

    let users = [ john, pete, mary ];

    let usersMapped = /* 여기에 코드를 작성하세요. */

    /*
    usersMapped = [
      { fullName: "John Smith", id: 1 },
      { fullName: "Pete Hunt", id: 2 },
      { fullName: "Mary Key", id: 3 }
    ]

    */
    /*
    alert( usersMapped[0].id ) // 1
    alert( usersMapped[0].fullName ) // John Smith
*/

let john = { name: "John", surname: "Smith", id: 1 };
let pete = { name: "Pete", surname: "Hunt", id: 2 };
let mary = { name: "Mary", surname: "Key", id: 3 };

let users = [ john, pete, mary ];

let usersMapped = users.map(( item, index) => {
    let temp = { fullName: item.name[0].toUpperCase() + item.name.slice(1) + " " + item.surname[0].toUpperCase() + item.surname.slice(1), id : index + 1};
    return temp;
})

    /*
    usersMapped = [
      { fullName: "John Smith", id: 1 },
      { fullName: "Pete Hunt", id: 2 },
      { fullName: "Mary Key", id: 3 }
    ]
    */

alert( usersMapped[0].id ) // 1
alert( usersMapped[0].fullName ) // John Smith

