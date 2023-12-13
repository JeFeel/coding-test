package programmers.week2.day9;


import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class Solution2 {
    public String solution(String[] my_strings, int[][] parts) {
        // 이하는 stream을 사용하려고 시도한 실패 흔적들
//        return Arrays.stream(parts)
//                .map(range -> my_strings[range[0]].substring(range[1], range[2] + 1))
//                .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
//                .toString();
//        return Arrays.stream(my_strings)
//                .map(str ->
//                        Arrays.stream(parts)
//                                .flatMapToInt(Arrays::stream)
//
//                )
//                .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
//                .toString();

        /* IntStream을 활용해보자 */
        return IntStream.range(0, my_strings.length)
                .mapToObj(i -> my_strings[i].substring(parts[i][0], parts[i][1] + 1))
                .collect(Collectors.joining());
    }


}
