package programmers.week1.day7;


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


public class Solution5 {

    //    정수 배열 arr가 주어집니다. arr를 이용해 새로운 배열 stk를 만드려고 합니다.
//
//    변수 i를 만들어 초기값을 0으로 설정한 후 i가 arr의 길이보다 작으면 다음 작업을 반복합니다.
//
//    만약 stk가 빈 배열이라면 arr[i]를 stk에 추가하고 i에 1을 더합니다.
//    stk에 원소가 있고, stk의 마지막 원소가 arr[i]보다 작으면 arr[i]를 stk의 뒤에 추가하고 i에 1을 더합니다.
//    stk에 원소가 있는데 stk의 마지막 원소가 arr[i]보다 크거나 같으면 stk의 마지막 원소를 stk에서 제거합니다.
//    위 작업을 마친 후 만들어진 stk를 return 하는 solution 함수를 완성해 주세요.
    public int[] solution(int[] arr) {
        List<Integer> str = new ArrayList<>();
        int i = 0;

        while (i < arr.length) {
            if (str.isEmpty()) {
                str.add(arr[i]);
                i++;
                continue;
            }

            if (str.get(str.size() - 1) < arr[i]) {
                str.add(arr[i]);
                i++;
                continue;
            }

            if (str.get(str.size() - 1) >= arr[i]) {
                str.remove(str.size() - 1);
            }
        }

        return str.stream().mapToInt(n -> n).toArray();

        // Stack을 이용해서 더 간단하게 풀어보기
//        Stack<Integer> stack = new Stack<>();
//
//        for (int num : arr) {
//            while (!stack.isEmpty() && num <= stack.peek()){
        //  stack이 비어있지 않고 arr의 요소가 stack의 최근 데이터보다 크지 않을 경우 (2번 조건)
//                stack.pop(); // stack에서 최근 데이터 삭제
//          }
//            stack.push(num); // stack에 데이터 추가 (1번 조건)
//        }
//
//        return stack.stream().mapToInt(i -> i).toArray();
    }
}
