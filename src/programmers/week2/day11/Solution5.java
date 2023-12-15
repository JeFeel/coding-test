package programmers.week2.day11;

import java.util.stream.IntStream;

public class Solution5 {
    public int solution(int[] arr, int idx) {
        return IntStream.range(idx, arr.length)
                .filter(i -> arr[i] == 1)
                .findFirst()
//                .orElse(-1)
                .orElseGet(()-> -1);

        // orElse은 항상 호출되므로 조심해서 사용해야 된다.
    }
}
