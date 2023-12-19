package programmers.basic.week1.day4;


public class Solution4 {

    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;

        if (ineq.equals("<")) {
            switch (eq){
                case "=" : return n <= m ? 1 : 0;
                case "!" : return n < m ? 1 : 0;
            }

//            if (eq.equals("=")) return n <= m ? 1 : 0;
//            else return n < m ? 0 : 1;
        }

        if (ineq.equals(">")) {
            switch (eq) {
                case "=":
                    return n >= m ? 1 : 0;
                case "!":
                    return n > m ? 1 : 0;
            }
        }

//            if (eq.equals("=")) return n >= m ? 1 : 0;
//            else return n > m ? 0 : 1;
        return answer;
    }
}
