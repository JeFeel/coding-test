package programmers.day1;


import java.util.Scanner;


public class Solution1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        // 만약 입력값이 없거나 백만을 초과할 경우
        if(!(str.isEmpty() || str.length()> 1000000)){
            System.out.println(str);
        }
    }

}
