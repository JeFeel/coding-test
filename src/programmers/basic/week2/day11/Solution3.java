package programmers.basic.week2.day11;


public class Solution3 {
    public String solution(String my_string, int[] indices) {
        StringBuilder builder = new StringBuilder(my_string);

        for (int i : indices) {
            builder.setCharAt(i, ' ');  // char 공백
        }

        return builder.toString().replace(" ", ""); // 문자열 공백

        // indices에 포함 '안' 되는 문자열들만 filter
//        return IntStream.range(0, my_string.length())
//                .filter(i -> !IntStream.of(indices).boxed().collect(Collectors.toSet()).contains(i))
//                .mapToObj(my_string::charAt)
//                .map(Object::toString)
//                .collect(Collectors.joining());
    }
}
