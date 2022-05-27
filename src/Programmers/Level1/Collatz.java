package Programmers.Level1;

public class Collatz {
    public static int solution(int num) {
        long num2 = num;
        int answer = 0;

        while (num2 != 1) {
            if (answer > 500) {
                answer = -1;
                break;
            }
            if (num2 % 2 == 0) num2 /= 2;
            else num2 = num2 * 3 + 1;

            answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(6));
    }
}
