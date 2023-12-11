package programmers.week1.day5;


public class Solution4 {

    public int solution(int[] num_list) {
//        int answer = 0;
        int multiply = 1;
        int sum = 0;

        for (int i : num_list) {
            multiply *= i;
            sum += i;
        }

        int squareSum = (int) Math.pow(sum,2);

//        if (multiply<squareSum) answer = 1;

        return multiply<squareSum ? 1 : 0;
    }
}
