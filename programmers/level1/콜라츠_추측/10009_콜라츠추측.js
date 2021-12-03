function solution(num) {
    var answer = 0;
    
    for (let i=0 ; i<500 ; i++) {
        if (num ==1) {
            answer = i;
            break;
        } else if (num%2 == 0) num/=2;
        else num = num*3+1;
    }
    if (num !== 1) answer = -1;
    return answer;
}

// 가장 인상깊은 코드
// 재귀함수에 대한 이해.

// function collatz(num,count = 0) {
//     return num == 1 ? (count >= 500 ? -1 : count) : collatz(num % 2 == 0 ? num / 2 : num * 3 + 1,++count);
// }

