package programmers.day3;


public class Solution5 {

    public int solution(int a, int b) {
        int answer = Integer.parseInt(a + "" + b);
        int multiplyAnswer = 2 * a * b;
        return Math.max(answer, multiplyAnswer);
    }
}
