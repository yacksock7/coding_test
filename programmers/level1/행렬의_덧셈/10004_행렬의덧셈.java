class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];
        
        for (int i=0; i<arr1.length ; i++) {
            for ( int j=0 ; j<arr1[i].length ; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return answer;
    }
}

// 가장 인상적인 코드 
// 문제를 보면 입력된 두개의 배열과 출력된 배열의 구조는 같을 수 밖에 없다. 
// 따라서 출력할 객체에 입력된 객체를 담아 구조를 세팅한다는 발상이 신선했다.
//
// class Solution {
//     public int[][] solution(int[][] arr1, int[][] arr2) {
//         int[][] answer = {};
//         answer = arr1;
//         for(int i=0; i<arr1.length; i++){
//             for(int j=0; j<arr1[0].length; j++){
//                 answer[i][j] += arr2[i][j];
//             }
//         }
//         return answer;
//     }
// }

