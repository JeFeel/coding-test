package programmers.week1.day7;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;


public class Solution2 {

    public int[] solution(int l, int r) {
//        List<Integer> arrayList = new ArrayList<>();
//
//        for (int i = l; i <= r; i++) {
//            String str = i + ""; //문자열 반환
//            int count = 0;
//            for (int j = 0; j < str.length(); j++) {
//                if (str.charAt(j) == 48 || str.charAt(j) == 53) {
//                    // 아스키 코드 0 , 5
//                    count++;
//                }
//            }
//            if (count == str.length()) arrayList.add(i);
//        }
//
//        int[] answer = arrayList.stream().mapToInt(i -> i).toArray();
//        int[] emptyNum = {-1};
//        if (answer.length == 0) return emptyNum;
//
//        return answer;
        int[] answer = IntStream.rangeClosed(l, r).filter(i -> {
            String strNum = String.valueOf(i);
            return strNum.matches("[05]+");
        }).toArray();

        return answer.length == 0 ? new int[]{-1} : answer;
    }
}
