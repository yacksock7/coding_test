import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> set = new HashSet<>();

        for (int i=0 ; i<numbers.length ; i++) {
            for (int j=i+1 ; j<numbers.length ; j++ ){
                set.add(numbers[i]+numbers[j]);
            }
        }
        return set.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
    
// 1. anyMatch()메서드를 사용하여 배열에 지정된 값이 포함되어 있는지 확인
// anyMatch()메소드를 사용하여 주어진 배열에서 지정된 값을 찾을 수 있습니다. 이 메소드는 true또는 false의 부울 값을 반환합니다. 람다 식을 인수로 사용하며 Java 8 이상 버전에서 사용할 수 있습니다.
//     
//     import java.util.Arrays;
    public boolean contains(final int[] arr, final int key) {
        return Arrays.stream(arr).anyMatch(i -> i == key);
    }
    
// 2. contains()메서드를 사용하여 배열에 지정된 값이 포함되어 있는지 확인
// contains()메서드를 사용하여 주어진 배열에서 지정된 값을 찾을 수 있습니다. 이 메소드는 true또는 false의 부울 값을 반환합니다. 두 가지 인수가 필요합니다. 첫 번째는 배열이고 두 번째는 찾을 값입니다. contains()메소드는 Apache commons 라이브러리의ArrayUtils 클래스에 속합니다. 아래 예를 참조하십시오.
//     
//     import org.apache.commons.lang3.ArrayUtils;
    // public boolean contains(final int[] arr, final int key) {
    //     return ArrayUtils.contains(arr, key);
    // }
    
// 3. contains()메서드를 사용하여 배열에 지정된 값이 포함되어 있는지 확인
// 배열을Arrays.asList()를 사용하여 목록으로 변환 한 다음 목록의contains()메서드를 사용하여 주어진 배열에서 지정된 값을 찾을 수 있습니다. 이 메서드는 true 또는 false의 부울 값을 반환합니다. 값을 찾아야하는 인수로 사용합니다. 아래 예를 참조하십시오.
//     
//     import java.util.Arrays;
    // public boolean contains(final int[] arr, final int key) {
    //     return Arrays.asList(arr).contains(key);
    // }
    
    
// 4. binarySearch()메서드를 사용하여 배열에 지정된 값이 포함되어 있는지 확인
// binarySearch()메소드를 사용하여 주어진 배열에서 지정된 값을 찾을 수 있습니다. 이 메서드는 일치 후 값을 반환합니다. 이 방법을 적용하기 전에 배열이 정렬되면 작동합니다. 아래 예를 참조하십시오.
// 
//     import java.util.Arrays;
    // public boolean contains(final int[] arr, final int key) {
    //      Arrays.sort(arr);  
    //      return Arrays.binarySearch(arr, key) >= 0; 
    // }
    
    
// 5. 사용자 지정 코드를 사용하여 배열에 지정된 값이 포함되어 있는지 확인
// 사용자 지정 코드를 사용하여 지정된 배열에서 지정된 값을 찾을 수 있습니다. 배열에서 값을 찾고 부울 값 (true 또는 false)을 반환하는 사용자 지정 메서드를 만듭니다. 이 메서드는 두 개의 인수를 사용합니다. 첫 번째는 배열이고 두 번째는 찾아야하는 값입니다. 아래 예를 참조하십시오.
// 
//     
//     public boolean contains(final int[] arr, final int key) {
//         boolean found = false;
//         for(int i = 0; i < arr.length; i++) {
//             if(arr[i]==key) {
//                 found=true;
//             }
//         }
//         return found; 
//     }
}

// https://www.delftstack.com/ko/howto/java/java-array-contains-int/
