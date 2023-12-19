package programmers.basic.week1.day7;


import java.util.stream.IntStream;


public class Solution3 {
    public int[] solution(int start_num, int end_num) {

        return IntStream.rangeClosed(start_num, end_num).toArray();
    }
}
