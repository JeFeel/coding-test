package programmers;


import java.util.Stack;


public class PairDelete {

    public int solution(String s) {

        Stack<Character> characters = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char index = s.charAt(i);

            // stack이 비어있는 경우
            if (characters.isEmpty()){
                characters.push(index);
                continue;
            }

            if (characters.peek().equals(index)){
                characters.pop();
            }else {
                characters.push(index);
            }

        }

        return characters.isEmpty() ? 1 : 0;
    }
}
