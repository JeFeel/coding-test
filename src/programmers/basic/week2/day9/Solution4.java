package programmers.basic.week2.day9;


import java.util.ArrayList;
import java.util.List;


public class Solution4 {

    public String[] solution(String my_string) {
        List<String> stringList = new ArrayList<>();

        for (int i = 0; i < my_string.length(); i++) {
            stringList.add(my_string.substring(i));
        }

        return stringList.stream().sorted().toArray(String[]::new);

        // 여기에도 IntStream을 활용해보자
//        return IntStream.range(0, my_string.length())
//                .mapToObj(my_string::substring)
//                .sorted().toArray(String[]::new);
    }
}
