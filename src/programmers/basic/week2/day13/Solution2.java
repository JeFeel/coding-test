package programmers.basic.week2.day13;


import java.util.Arrays;
import java.util.stream.IntStream;


public class Solution2 {
    public int[] solution(int[] num_list, int n) {
        int[] formerArray = Arrays.copyOfRange(num_list, 0, n);
        int[] latterArray = Arrays.copyOfRange(num_list, n-1, num_list.length);

        return IntStream.concat(IntStream.of(latterArray), IntStream.of(formerArray)).toArray();
    }
}
