package programmers.basic.week2.day8;


import java.util.*;
import java.util.stream.Collectors;


public class Solution2 {

    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        int[] diceNum = new int[]{a, b, c, d};

        List<Integer> list = Arrays.stream(diceNum)
                .sorted()
                .boxed()
                .collect(Collectors.toList());

        int count = Collections.frequency(list, list.get(0));
        switch (count) {
            case 4 -> { // 전부 같은 숫자
                answer = 1111 * list.get(0);
                break;
            }
            case 3 -> { // 세 개가 같은 숫자
                answer = (int) Math.pow(10 * list.get(0) + list.get(3), 2);
                break;
            }
            case 2 -> { // 두 개 숫자가 같은 경우
                // 1. 나머지 둘이 같을 경우
                // 2. 나머지 둘이 다를 경우
                if (!Objects.equals(list.get(2), list.get(3))) {
                    answer = list.get(2) * list.get(3);
                }
                if (list.get(2).equals(list.get(3))) {
                    answer = (list.get(0) + list.get(2)) * Math.abs(list.get(0) - list.get(2));
                }
                break;
            }
            case 1 -> {
                // 1. 나머지 셋이 같을 경우
                if (Collections.frequency(list, list.get(1))==3)
                 answer = (int) Math.pow(10 * list.get(1) + list.get(0), 2);
                // 2. 나머지 셋 중 둘만 같을 경우
                if (Collections.frequency(list, list.get(1))==2|| Collections.frequency(list, list.get(2))==2){
                    // 가운데 두 숫자만 같을 경우
                    answer = list.get(0)* list.get(3);

                    if (list.get(1)< list.get(2)){
                        // 뒤에 두 숫자만 같을 경우
                        answer = list.get(0)*list.get(1);
                    }
                    break;
                }
                // 3. 나머지 셋이 모두 다를 경우
                if (!Objects.equals(list.get(1), list.get(2)) && !Objects.equals(list.get(2), list.get(3))){
                    answer = list.get(0);
                }
                break;
            }
            default -> throw new IllegalStateException("Unexpected value: " + count);
        }
        return answer;
    }
}
