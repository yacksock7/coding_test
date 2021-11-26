function solution(arr1, arr2) {
    const answer = arr1.map((a , index1) => {
       return a.map((b, index2) => {
            return b + arr2[index1][index2];
        }); 
    });
    return answer;
}

// 가장 인상깊은 코드 
// 사용한 함수는 같은데 몹시 간결한 코드를 작성했다. 코드가 간결해 질수록 가독성이 떨어진다. 중간점을 고민해 보자.
// 
// function sumMatrix(A,B){
//     return A.map((a,i) => a.map((b, j) => b + B[i][j]));
// 
// }
