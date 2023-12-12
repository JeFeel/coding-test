package programmers.week2.day8;


public class Solution3 {

    public String solution(String my_string, int[] index_list) {
        String answer = "";
        for (int i : index_list) {
            answer += my_string.charAt(i);
        }
        return answer;
    }
}
