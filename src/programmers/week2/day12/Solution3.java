package programmers.week2.day12;


import java.util.Arrays;
import java.util.stream.IntStream;


public class Solution3 {

    public int[] solution(int[] arr, int[][] intervals) {

        IntStream ints = IntStream.of(Arrays.copyOfRange(arr, intervals[0][0], intervals[0][1] + 1));

        for (int i = 1; i < intervals.length; i++) {
            ints = IntStream.concat(ints, IntStream.of(Arrays.copyOfRange(arr, intervals[i][0], intervals[i][1] + 1)));
        }
        return ints.toArray();
    }
}
