package programmers.week2.day12;


import java.util.stream.IntStream;


public class Solution2 {
    public int solution(int[] num_list) {
        return IntStream.range(0, num_list.length)
                .filter(i-> num_list[i]<0)
                .findFirst()
                .orElseGet(()->-1);
    }
}
