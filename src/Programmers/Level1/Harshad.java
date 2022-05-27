package Programmers.Level1;

public class Harshad {
    public static boolean solution(int x) {
        boolean answer = false;
        int numDigits = 0;
        int X = x;
        int sum = 0;
        while (X > 0) {
            int digit = X % 10;
            sum += digit;
            numDigits++;
            X /= 10;
        }

        if (x % sum == 0) answer = true;

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(13));
    }
}
