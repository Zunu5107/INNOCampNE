let item = 1;
let input;
let base = [];
let i,x;

for (i = 0; base.length < 3; i++){
    x = Math.floor(Math.random() * 10);
    if(!base.includes(x) && i % 2 == 0)
        base.push(x);
}
console.log(base);


/*
input = prompt(
`${item}회차 공 던지기 \n예시) 123 = 1,2,3`
,"");
*/
//input.split("")
