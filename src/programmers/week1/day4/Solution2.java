package programmers.week1.day4;


public class Solution2 {

    public int solution(int number, int n, int m) {
        int answer = 0;

        if (number % n == 0 && number % m == 0) {
            answer = 1;
        }
        return answer;

//        삼항연산자
//        return number % n == 0 && number % m == 0 ? 1 : 0;
    }
}
