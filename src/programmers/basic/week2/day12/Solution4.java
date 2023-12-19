package programmers.basic.week2.day12;


import java.util.*;

public class Solution4 {

    public int[] solution(int[] arr) {
//        List<Integer> list = new ArrayList<>();
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == 2) list.add(i);
//        }
//
//        if (list.isEmpty()) {
//            return new int[]{-1};
//        }
//
//        int min = Collections.min(list);
//        int max = Collections.max(list);
//
//        return Arrays.copyOfRange(arr, min, max + 1);

        // stream으로 코드를 줄여보자
        List<Integer> list = Arrays.stream(arr).boxed()
                .toList(); // Java 16 이전은 collect(Collectors.toList()); 사용
        return list.contains(2) ? list.subList(list.indexOf(2), list.lastIndexOf(2)+1)
                .stream().mapToInt(i->i).toArray() : new int[]{-1};
    }
}
