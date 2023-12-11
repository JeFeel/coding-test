package programmers.week1.day5;


public class Solution3 {

    public int solution(int a, int b, int c) {
        int answer = 0;
        int sum = a + b + c;
        double squarePow = Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2);
        double cubePow = Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3);

        if (a == b && b == c) {
            answer = (int) (sum*squarePow*cubePow);
        } else if (a != b && b != c && a != c) {
            answer = sum;
        } else {
            answer = (int) (sum*squarePow);
        }

        return answer;
    }


}
