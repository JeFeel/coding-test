package programmers.week2.day11;

import java.util.stream.IntStream;


public class Solution2 {

    public int[] solution(int n, int k) {
        return IntStream.rangeClosed(1, n)
                .filter(i -> i % k == 0)
                .sorted()
                .toArray();
    }
}
