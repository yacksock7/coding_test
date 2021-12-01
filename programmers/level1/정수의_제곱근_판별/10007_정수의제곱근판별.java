class Solution {
    public long solution(long n) {
        long answer = 0;
        double n2 = n;
        n2 /= 2;
        int i =0;
        while (true) {
            i++;
            n2-=i;
            if (n2 < 0) {
                answer = (n2+i)*2 == i ? (long) Math.pow(i+1, 2) : -1;
                break;
            }
        }
        return answer;
    }
}

// 가장 인상깊은 코드
// Math.pow(), sqrt(), floor() 와 같은 java 함수의 능숙한 사용이 멋있었다.

// 1. 
// class Solution {
//   public long solution(long n) {
//       if (Math.pow((int)Math.sqrt(n), 2) == n) {
//             return (long) Math.pow(Math.sqrt(n) + 1, 2);
//         }
//         return -1;
//   }
// }

// 2.
// class Solution {
//   public long solution(long n) {
//     double i = Math.sqrt(n);
//     return Math.floor(i) == i ? (long) Math.pow(i + 1, 2) : -1;
//   }
// }

