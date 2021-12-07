function solution(n) {
    var answer = 0;
    
    n = n/2;
    let i = 0;
    while(true) {
        i++;
        n -= i;
        if(n < 0) {
            answer = (n+i)*2===i ? (i+1)**2 : -1;
            break;
        }
    }
    return answer;
}

// 가장 인상깊은 코드 
// js 함수로만 풀어서 신성했다. 나는 제곱근 구하는 공식을 사용하였다.
// 
// function nextSqaure(n){
//     var result = 0;
//     var n = Math.sqrt(n);
//     result = Number.isInteger(n) ? Math.pow(n+1, 2) : 'no';
//     return result;
// }

