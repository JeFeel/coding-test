package programmers.day6;


public class Solution5 {

    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];
            int min = Integer.MAX_VALUE;

            for (int j = s; j <= e; j++) {
                if (arr[j] > k && arr[j] < min) {
                    min = arr[j]; // k보다 큰 경우면 min에 일단 저장
                }
            }
            // 갱신된 min이 Integer.MAX_VALUE랑 비교해서
            // 값이 같으면 (즉 쿼리의 답이 없으면) -1
            // 다르면 갱신된 min을 answer에 저장
            answer[i] = min == Integer.MAX_VALUE ? -1 : min;
        }
        return answer;
    }
}
