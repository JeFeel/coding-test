package programmers.basic.week2.day10;

import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class Solution5 {

    public String solution(int q, int r, String code) {

        // 왜 Collectors.joining()에 에러가 발생할까?
//        return IntStream.range(0, code.length())
//                .filter(i -> i % q == r)
//                .mapToObj(code::charAt)
//                .collect(Collectors.joining())   // 이미 문자열을 반환하기 때문
//                .toString();

        return IntStream.range(0, code.length())
                .filter(i -> i % q == r)
                .mapToObj(i -> String.valueOf(code.charAt(i)))
                .collect(Collectors.joining());
    }
}
