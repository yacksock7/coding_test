class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int result = 0;
        
        String[] aList = String.valueOf(x).split("");
        for (String a : aList) {
            result += Integer.parseInt(a);
        }
        return (x%result == 0);
    }
}

// 가장 인상적인 코드 : int a = (int) char-48;
// int > String > toCharArray() -> char[] > (int) char-48 > int  (GOOD!!!)
// 
// public class HarshadNumber{
//     public boolean isHarshad(int num){
//         char[] charArr = String.valueOf(num).toCharArray();
//         int divisor = 0;
// 
//         for (char c : charArr) {
//             divisor += (int) c - 48;
//         }
//     return (num % divisor == 0);
//     }
// }

