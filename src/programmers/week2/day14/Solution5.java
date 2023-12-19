package programmers.week2.day14;


public class Solution5 {
    public int[] solution(int[] arr, int[][] queries) {
        for (int[] query : queries) {
             for (int i = query[0]; i <= query[1]; i++) {
                arr[i]++;
            }
        }
        return arr;
    }
}
