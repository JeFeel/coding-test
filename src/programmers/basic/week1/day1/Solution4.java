package programmers.basic.week1.day1;


import java.util.Scanner;


public class Solution4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        StringBuilder solution = new StringBuilder();

        for (char str : a.toCharArray()) {
            if (Character.isLowerCase(str)) {
                solution.append(Character.toUpperCase(str));
            }

            if (Character.isUpperCase(str)) {
                solution.append(Character.toLowerCase(str));
            }
        }

        System.out.println(solution);
    }
}
