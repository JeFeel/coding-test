package programmers.day4;


public class Solution3 {

    public int solution(int n) {
        int answer = 0;

        // 홀수인 경우
        if (n % 2 == 1) {
            // n 이하의 홀수인 모든 양의 정수의 합
            for (int i = 0; i < n + 1; i++) {
                if (i % 2 == 1) answer += i;
            }
        }

        // 짝수인 경우
        if (n % 2 == 0) {
            // n 이하의 짝수인 모든 양의 정수의 제곱의 합
            for (int i = 0; i < n + 1; i++) {
                if (i % 2 == 0) {
                    answer += (int) Math.pow(i, 2);
                }
            }

        }

        // 더 짧은 풀이
        /* n이 짝수든 홀수든 다음 숫자와 2씩 차이남
        * 감소식을 활용
        * answer 증가시킬 때 삼항연산자를 넣어 짝수일 경우 제곱을,
        * 홀수일 경우에는 해당 숫자를 그대로 대입
        */
//        for(int i = n; i >= 0; i -= 2)
//            answer += (n % 2 == 0) ? i * i : i;

        return answer;
    }
}
