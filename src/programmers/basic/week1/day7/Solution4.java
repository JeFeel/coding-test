package programmers.basic.week1.day7;


import java.util.stream.IntStream;


public class Solution4 {

    public int[] solution(int n) {
//        List<Integer> list = new ArrayList<>();
//        list.add(n);
//        while (n != 1) {
//            switch (n % 2) {
//                case 0 -> {
//                    list.add(n / 2);
//                    n = n / 2;
//                }
//                case 1 -> {
//                    list.add(n * 3 + 1);
//                    n = n * 3 + 1;
//                }
//            }
//        }
//        int[] answer = list.stream().mapToInt(i -> i).toArray();
//        return answer;

        // 계산식이 중복되서 지저분해 보인다
        // 아래처럼 간결하게 바꿔보자
        return IntStream.concat(
                // 두 개의 배열을 합친다
                // 배열 1 : 문제 조건에 부합하는 숫자들의 배열
                        IntStream.iterate(n, i -> i > 1,
                                i -> i % 2 == 0 ? i / 2 : i * 3 + 1),
                // 배열 2 : 마지막에 1 을 남기도록 1만 담긴 배열
                        IntStream.of(1))
                .toArray();
    }
}
