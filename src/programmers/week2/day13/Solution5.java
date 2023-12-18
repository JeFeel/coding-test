package programmers.week2.day13;

import java.util.stream.IntStream;

public class Solution5 {
    public int[] solution(int[] num_list, int n) {
        // n개 간격이다 -> 인덱스가 n의 배수인 곳만 골라서 filter한다

        return IntStream.range(0, num_list.length)
                .filter(i -> i % n == 0)
                .map(i -> num_list[i])
                .toArray();
    }
}
