package programmers.basic.week2.day14;


public class Solution1 {

    public int solution(int[] num_list) {
        int odd = 0, even = 0;

        //첫번째 원소가 1번 원소
        for (int i = 0; i < num_list.length; i++) {
            // 짝수번 인덱스지만 홀수 번째 원소
            if (i % 2 == 0)
                odd+=num_list[i];
            // 홀수번 인덱스지만 짝수번째 원소
            if (i%2==1) even+=num_list[i];
        }
        return Math.max(odd, even);
    }

//     return Integer.max(IntStream.iterate(0, i -> i < num_list.length, i -> i + 2)
//                .map(i -> num_list[i])
//                .sum(), IntStream.iterate(1, i -> i < num_list.length, i -> i + 2)
//                .map(i -> num_list[i])
//                .sum());
}
