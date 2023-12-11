package programmers.week1.day6;


public class Solution2 {

    public int solution(int n, String control) {
        int answer = n;
        for (int i = 0; i < control.length(); i++) {
            switch (control.charAt(i)) {
                case 'w' -> answer += 1;
                case 's' -> answer -= 1;
                case 'd' -> answer += 10;
                case 'a' -> answer -= 10;
                default -> throw new IllegalStateException("Unexpected value: " + control.charAt(i));
            }
        }

        // control을 charArray로 바꿔서 풀어보기
//        for(char c : control.toCharArray()){
//            n += c == 'w' ? 1 : c == 's' ? -1 : c == 'd' ? 10 : -10;
//        }
//        return n;
        return answer;
    }


}
