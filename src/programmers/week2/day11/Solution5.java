package programmers.week2.day11;

import java.util.stream.IntStream;

public class Solution5 {
    public int solution(int[] arr, int idx) {
        return IntStream.range(idx, arr.length)
                .filter(i -> arr[i] == 1)
                .findFirst()
                .orElse(-1);
    }
}
