package programmers.basic.week2.day14;


public class Solution4 {
    public int solution(int[] numbers, int n) {
        int answer = 0;

        for (int number : numbers) {
            answer += number;

            if (answer > n) break;
        }
        return answer;
    }
}
