package programmers.week2.day14;


import java.util.stream.IntStream;


public class Solution2 {

    public String[] solution(String[] names) {
        return IntStream.range(0, names.length)
                .boxed()
                .filter(i -> i % 5 == 0)
                .map(i -> names[i])
                .toArray(String[]::new);
    }
}
