class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long temp = 0;
        for (int i=0; i<n ; i++) {
            temp += x;
            answer[i] = temp;
            System.out.println(temp);
        }
        
        return answer;
    }
}

// 가장 인상깊은 코드 
// 공식을 사용하여 변수 선언을 최소화하여 코드를 간결하게 만든것이 인상깊었다.
//
// class Solution {
//   public long[] solution(long x, int n) {
//       long[] answer = new long[n];
//       for(int i = 0; i < n; i++){
//           answer[i] = x * (i + 1);
//       }
//       return answer;
//   }
// }
