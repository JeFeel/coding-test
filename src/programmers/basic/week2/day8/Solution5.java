package programmers.basic.week2.day8;


public class Solution5 {
    public String solution(String my_string, int[][] queries) {
        char[] arr = my_string.toCharArray();

        for (int[] query : queries) {
            int start = query[0];
            int end = query[1];

            while(start < end){
                char temp = arr[start]; // 시작 지점값 따로 저장
                arr[start] = arr[end];  // 시작 지점에 끝 지점값 저장
                arr[end] = temp;        // 끝 지점에 시작 지점값 저장

                start++;
                end--;
            }

        }
        return new String(arr);
    }
}
