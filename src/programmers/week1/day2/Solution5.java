package programmers.week1.day2;


public class Solution5 {

    public String solution(String my_string, String overwrite_string, int s) {
        String answer = my_string.substring(0, s) + overwrite_string;

        if (my_string.length() > overwrite_string.length()) {
            answer += my_string.substring(answer.length());
        }

        return answer;
    }
}
