process.stdin.setEncoding('utf8');
process.stdin.on('data', data => {
    const n = data.split(" ");
    const a = Number(n[0]), 
          b = Number(n[1]);
    
    const value = new Array(a).fill("*").join("");
    for (let i=0 ; i<b ; i++) console.log(value);
});

// 가장 인상깊은 코드 : String.repeat(Number); 라는 함수를 배웠다.
// 
// process.stdin.setEncoding('utf8');
// process.stdin.on('data', data => {
//     const n = data.split(" ");
//     const a = Number(n[0]), b = Number(n[1]);
//     const row = '*'.repeat(a)
//     for(let i =0; i < b; i++){
//         console.log(row)
//     }
// });
