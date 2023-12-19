package programmers.week2.day14;


import java.util.ArrayList;
import java.util.List;


public class Solution3 {

    public String[] solution(String[] todo_list, boolean[] finished) {
        List<String> answer = new ArrayList<>();

        for (int i = 0; i < todo_list.length; i++) {
            if (!finished[i]) answer.add(todo_list[i]);
        }
        return answer.toArray(String[]::new);
    }
}
