class Solution {
    public int solution(int num) {
        int answer = 0;
        double num2 = num;
    for (int i=0 ; i<500 ; i++) {
        if (num2 == 1) {
            answer = i;
            break;
        } else if (num2%2 == 0) {
            num2/=2;
        } else {
            num2 = num2*3+1;
        } 
    }
    if (num2 != 1) { answer = -1; }
    return answer;
    }
}

// 가장 인상적인 코드
// int를 사용해서 풀면 소숫점 및은 다 날리는구나... 당연한것인데 놓치고 있었다,
// 들어오는 인자값 자체를 long으로 받아온다는 발상이 인상깊었다.
//
// class Solution {
//     public int solution(long num) {
//         int answer = 0;

//         while(num != 1){
//             answer++;
//             if(answer==500)
//                 return -1;
//             if(num%2==0){
//                 num/=2;
//             }else{
//                 num=num*3+1;
//             }
//         }
//         return answer;
//     }
// }

