package programmers.basic.week2.day10;


public class Solution3 {

    public String solution(String my_string, int s, int e) {
        String answer = my_string.substring(s, e + 1);

        StringBuilder strb = new StringBuilder(answer);
        String reverseStr = strb.reverse().toString();

        my_string = my_string.replaceAll(answer, reverseStr);

        return my_string;
    }
}
