function solution(x, n) {
    var answer = [];
    let temp = 0; 
    for (let i=0 ; i<n ; i++) {
        temp += x;
        answer.push(temp);
    };
    
    return answer;
}

// 가장 인상깊은 코드 
// 길이가 n인 리스트를 생성하고 모든 indec에 x값을 넣어둔뒤 map을 통해 index * (x+1)로 재배열한다.
//
// function solution(x, n) {
//     return Array(n).fill(x).map((v, i) => (i + 1) * v)
// }
