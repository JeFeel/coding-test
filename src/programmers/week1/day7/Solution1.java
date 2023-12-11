package programmers.week1.day7;


public class Solution1 {

    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[arr.length];

        System.arraycopy(arr, 0, answer, 0, arr.length);

        for (int i = 0; i < queries.length; i++) {
            int s = queries[i][0], e = queries[i][1], k = queries[i][2];
            // 0 4 1
            for (int j = s; j <= e; j++) {
                if (j % k == 0) {
                    answer[j] += 1;
                }
            }
        }
        return answer;
    }
}
