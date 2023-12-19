package programmers.basic.week1.day5;


public class Solution1 {

//    public String solution(String code) {
//        String answer = "";
//        int mode = 0;
//        for (int i = 0; i < code.length(); i++) {
//            if (code.charAt(i) == '1') mode = 1 - mode;
//            else if (i % 2 == mode) answer += code.charAt(i);
//        }
//        return answer.isEmpty() ? "EMPTY" : answer;
//    }

    // else if 안 써보기
    public String solution(String code) {
        String answer = "";
        int mode = 0;
        for (int i = 0; i < code.length(); i++) {

            if (code.charAt(i) == '1'){
                mode = mode == 0 ? 1 : 0;
                continue;
            }

            if (i % 2 == mode) answer += code.charAt(i);
        }
        return answer.isEmpty() ? "EMPTY" : answer;
    }
}
