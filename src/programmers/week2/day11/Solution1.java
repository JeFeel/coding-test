package programmers.week2.day11;


public class Solution1 {

    public int[] solution(String my_string) {
        int[] answer = new int[52];
        // ascii code
        // A~Z : 65~90
        // a~z : 97~122

        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);

            if (c >= 'A' && c <= 'Z') {
                answer[c - 'A']++;
            }

            if (c >= 'a' && c <= 'z') {
                answer[c - 'a' + 26]++;
            }

            // 삼항연산자로 한 줄 코드
//            answer[c-'A'-(Character.isLowerCase(c) ? 6 : 0)]++;
            // c가 'a'일 경우 97 - 65 = 32
            // 6을 더 빼야 26번 index에 추가
        }

        return answer;
    }
}
