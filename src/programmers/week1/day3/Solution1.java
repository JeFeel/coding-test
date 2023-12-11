package programmers.week1.day3;


public class Solution1 {
    public String solution(String str1, String str2) {
        String answer = "";

        //str1이 먼저 시작하니까 str1 length를 기준으로
        for (int i = 0; i < str1.length(); i++) {
            answer += str1.charAt(i);
            answer += str2.charAt(i);
        }
        return answer;
    }
}
