class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        for (int i=0 ; i<arr.length ; i++) {
            answer += arr[i];
        }
        
        return answer / arr.length;
    }
}


// 가장 인상적인 코드
// stream을 능숙하게 사용하고 싶다ㅠㅠ (stream 공부 리스트 추가...)
// 
// class Solution {
//     public double solution(int[] arr) {
//         return (int) Arrays.stream(array).average().orElse(0);
//     }
// }

