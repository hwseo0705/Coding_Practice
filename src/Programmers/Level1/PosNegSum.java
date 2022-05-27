package Programmers.Level1;

public class PosNegSum {
    public static int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for (int i = 0; i < absolutes.length; i++) {
            if (signs[i]) answer += absolutes[i];
            else answer -= absolutes[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[] {1,2,3}, new boolean[] {false,false,true}));
    }
}
