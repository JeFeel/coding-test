package programmers.basic.week1.day4;


public class Solution1 {

    public int solution(int num, int n) {
        int answer = 0;

        if (num % n == 0) {
            answer = 1;
        }
        return answer;
    }
}
