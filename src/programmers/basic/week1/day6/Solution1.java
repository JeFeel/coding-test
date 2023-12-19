package programmers.basic.week1.day6;


public class Solution1 {

    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length + 1];
        int last = num_list[num_list.length - 1];
        int beforeLast = num_list[num_list.length - 2];

        System.arraycopy(num_list, 0, answer, 0, num_list.length);

        answer[num_list.length] = last > beforeLast ? last-beforeLast : last*2;

        return answer;
    }
}
