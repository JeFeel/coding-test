package programmers.day5;


public class Solution5 {

    public int solution(int[] num_list) {
        String odd = "";
        String even = "";

        for (int i : num_list) {
            if (i%2!=0){
                odd+=String.valueOf(i);
            }
            if (i%2==0){
                even+=String.valueOf(i);
            }
        }

        return Integer.parseInt(odd)+Integer.parseInt(even);
    }
}
