package programmers.week2.day11;


import java.util.stream.IntStream;


public class Solution4 {

    public int[] solution(int start, int end_num) {
        // 10 9 8 7 ... 3
        return IntStream.rangeClosed(-start, -end_num) // -10, -3
                .map(i -> -i)
                .toArray();
    }
}
