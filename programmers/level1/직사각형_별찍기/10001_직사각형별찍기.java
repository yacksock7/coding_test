import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        String value = "*".repeat(a);
        for(int i=0 ; i<b ; i++) {
            System.out.println(value);
        }
    }
}

// 가장 인상적인 코드 : StringBuilder
// String과 StringBuilder, StringBuffer의 차이 공부하자. 
// IntStream.range(a,b)로 스트림을 만들어 forEach를 사용한것이 참신했다.
// IntStream에 대하여 : https://blog.daum.net/oraclejava/15874666
// Stream에 대하여 : https://postitforhooney.tistory.com/entry/Java-Java-Stream%EC%9D%98-%EA%B0%9C%EB%85%90%EA%B3%BC-%EC%A2%85%EB%A5%98-%EA%B7%B8%EB%A6%AC%EA%B3%A0-%EC%98%88%EC%A0%9C%EB%A5%BC-%ED%86%B5%ED%95%9C-%EC%B0%A8%EC%9D%B4%EC%A0%90-%EC%9D%B4%ED%95%B4%ED%95%98%EA%B8%B0

// import java.util.Scanner;
// import java.util.stream.IntStream;

// public class Solution {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();

//         StringBuilder sb = new StringBuilder();
//         IntStream.range(0, a).forEach(s -> sb.append("*"));
//         IntStream.range(0, b).forEach(s -> System.out.println(sb);
//     }
// }
