package programmers.day3;


public class Solution3 {
    public String solution(String my_string, int k) {
        String answer = "";

//        for (int i = 0; i < k; i++) {
//            answer += my_string;
//        }

        /*매개변수값 k만큼 문자열을 반복 repeat(n)*/
        answer = my_string.repeat(k);

        return answer;
    }
}
