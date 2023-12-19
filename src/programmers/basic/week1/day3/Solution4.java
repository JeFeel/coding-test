package programmers.basic.week1.day3;


public class Solution4 {
    public int solution(int a, int b) {
//        int answer = Integer.parseInt(Integer.toString(a)+Integer.toString(b));
//        int revertAnswer = Integer.parseInt(Integer.toString(b)+Integer.toString(a));

        /* 문자열+정수 연산에서 정수는 문자열로 처리된다 */
        int answer = Integer.parseInt(a + "" + b);
        int revertAnswer = Integer.parseInt(b + "" + a);

        return Math.max(answer, revertAnswer);

    }
}
