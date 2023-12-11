package programmers.week1.day2;


import java.util.Scanner;


public class Solution4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println(n + " is even");
        }

        if (n % 2 == 1) {
            System.out.println(n + " is odd");
        }
    }
}
