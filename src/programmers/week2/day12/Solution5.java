package programmers.week2.day12;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class Solution5 {
    public int[] solution(int[] arr, int[] query) {
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());

        for (int i = 0; i < query.length; i++) {
            switch (i % 2) {
                //짝수
                case 0 -> list = list.subList(0, query[i]+1); // 첫 인덱스부터 query[i]번 인덱스의 값까지
                //홀수
                case 1 -> list = list.subList(query[i], list.size()); // query[i]번 인덱스부터 list 끝까지
            }
        }
        return list.stream().mapToInt(i->i).toArray();

        // Stream으로 풀어보기
//        return IntStream.range(0, query.length)
//                .boxed() // IntStream에서 Stream<Integer> 객체로
//                .reduce(arr, (current, next) -> next % 2 == 0 ?
//                                Arrays.copyOfRange(current, 0, query[next] + 1) :
//                                Arrays.copyOfRange(current, query[next], current.length),
//                        (a,b)->a);
    }
}
