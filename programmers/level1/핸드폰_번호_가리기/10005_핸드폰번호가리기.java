class Solution {
    public String solution(String phone_number) {
        String answer = "";
        for (int i=0 ; i<phone_number.length() ; i++) {
            answer += i<phone_number.length()-4 ? "*": phone_number.charAt(i);
        }
        return answer;
    }
}

// 가장 인상적인 코드 
// String의 .toCharArray() 메소드를 사용해 chat배열로 바꿔서 푸셨구나. 배워갑니다.
//
// class Solution {
//   public String solution(String phone_number) {
//      char[] ch = phone_number.toCharArray();
//      for(int i = 0; i < ch.length - 4; i ++){
//          ch[i] = '*';
//      }
//      return String.valueOf(ch);
//   }
// }