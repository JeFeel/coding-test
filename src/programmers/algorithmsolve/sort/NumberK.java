package programmers.algorithmsolve.sort;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class NumberK {

    public int[] solution(int[] array, int[][] commands) {
//        List<Integer> answer = new ArrayList<>();
//
//        for (int[] command : commands) {
//            int[] slice = Arrays.stream(Arrays.copyOfRange(array, command[0], command[1])).sorted().toArray();
//            answer.add(slice[command[2]]);
//        }
//
//        return answer.stream().mapToInt(i->i).toArray();
//

        List<Integer> answer = new ArrayList<>();

        for (int[] command : commands) {
            int[] slice = Arrays.stream(Arrays.copyOfRange(array, command[0] - 1, command[1])).sorted().toArray();
            answer.add(slice[command[2] - 1]);
        }

        return answer.stream().mapToInt(i -> i).toArray();
    }
}
