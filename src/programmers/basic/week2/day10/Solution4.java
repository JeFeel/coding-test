package programmers.basic.week2.day10;


import java.util.ArrayList;
import java.util.List;


public class Solution4 {
    public String solution(String my_string, int m, int c) {
        StringBuilder answer = new StringBuilder();
        List<String> sliceStr = new ArrayList<>();

        for (int i = 0; i < my_string.length(); i+=m) {
            sliceStr.add(my_string.substring(i, i+m));
        }

        for (String string : sliceStr) {
            answer.append(string.charAt(c-1));
        }
        return answer.toString();
    }
}
