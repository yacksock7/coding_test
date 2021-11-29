function solution(phone_number) {
    return phone_number.split("")
        .map((num, i) => {
            return i <phone_number.length-4 ? "*" : num
        })
        .join("");
}

// 가장 인상적인 코드
// replace와 정규식의 콜라보... 대박. 정규식도 공부해볼까?
// 
// function hide_numbers(s) {
//   return s.replace(/\d(?=\d{4})/g, "*");
// }