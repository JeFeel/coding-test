package programmers.basic.week2.day9;


import java.util.stream.IntStream;


public class Solution5 {

    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        String[] suffixList = IntStream.range(0, my_string.length())
                .mapToObj(my_string::substring)
                .sorted().toArray(String[]::new);

        for (String string : suffixList) {
            if (string.contains(is_suffix) && string.equals(is_suffix)) {
                answer = 1;
                break;
            }
        }

        return answer;
        // 허무하게 끝내는 한줄 코드
//        return my_string.endsWith(is_suffix) ? 1 : 0;

    }
}
