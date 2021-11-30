function solution(x) {    
    let h = 0;
    x.toString().split("").forEach(e => h+= parseInt(e) );
    
    // let h = x.toString().split("").reduce((a,b) => +a + +b);
    return x%h === 0;
}

// 가장 인상깊은 코드 
// 잊었던 reduce의 상기 & Number + "" = String & +String = Number
// 
// function Harshad(n){
//   return !(n % (n + "").split("").reduce((a, b) => +b + +a ));
// }

