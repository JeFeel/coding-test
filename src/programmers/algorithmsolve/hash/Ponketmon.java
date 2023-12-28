package programmers.algorithmsolve.hash;


import java.util.Arrays;


public class Ponketmon {

    public int solution(int[] nums) {
        // level 1
        int size = nums.length / 2;

        int[] distinctArray = Arrays.stream(nums).distinct().sorted().toArray();
        int[] arr = new int[Math.min(distinctArray.length, size)]; // 불필요한 과정

        System.arraycopy(distinctArray, 0, arr, 0, Math.min(distinctArray.length, size));

        return (int) Arrays.stream(arr).distinct().count();
    }
}
