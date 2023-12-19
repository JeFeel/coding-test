package programmers.basic.week2.day9;


import java.util.Arrays;


public class Solution1 {

    public int[] solution(String[] intStrs, int k, int s, int l) {
//        List<Integer> solution = new ArrayList<>();
//
//        for (int i = 0; i < intStrs.length; i++) {
//            int parseInt = Integer.parseInt(intStrs[i].substring(s).length() == l ?
//                    intStrs[i].substring(s) : intStrs[i].substring(s, s + l));
//        // 왜 s+l인가?
//            if (parseInt > k) solution.add(parseInt);
//
//        }
//        return solution.stream().mapToInt(i -> i).toArray();
//    }

        // 너무 복잡하게 생각했다. 다시 해보자.
        return Arrays.stream(intStrs).mapToInt(v -> Integer.parseInt(v.substring(s, s + l))).filter(n -> n > k).toArray();
        //substring(a,b) : 인덱스 a부터 b-1까지 자른다
    }
}
