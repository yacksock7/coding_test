function solution(numbers) {
    var answer = [];
    
    numbers.forEach((num1, index1) => {
        numbers.forEach((num2, index2) => {
            const num = num1+num2;
            if (!answer.includes(num) && index1 !== index2){
                answer.push(num1+num2);    
            }
        });    
    });
    
    return answer.sort((a,b) => a-b);
}

// 가장 인상적인 코드 :
// 1. 나는 동일한 인덱스 value가 더해지는 것을 방지하기 위해 foreach의 index로 비교해서 걸러줬다. 이 사람은 이미 더해진 것과 같은 인덱스 value를 한번에 걸러주어 불필요한 액션까지 방지했다... 대다나다...
// 2. set에 담았다 받아서 중복을 처리했다. 알고는 있었는데 어떤게 성능면에서 좋은지 궁금하다. 알아보자.
// 
// function solution(numbers) {
//     const temp = []
//     for (let i = 0; i < numbers.length; i++) {
//         for (let j = i + 1; j < numbers.length; j++) {
//             temp.push(numbers[i] + numbers[j])
//         }
//     }
//     const answer = [...new Set(temp)]

//     return answer.sort((a, b) => a - b)
// }

