package programmers.basic.week1.day6;


public class Solution4 {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = arr;

        for (int i = 0; i < queries.length; i++) {
            int a = queries[i][0];
            int b = queries[i][1];
            int t = answer[a];
            answer[a] = answer[b];
            answer[b] = t;
        }

        return answer;
    }
}
