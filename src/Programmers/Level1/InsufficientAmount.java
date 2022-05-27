package Programmers.Level1;

public class InsufficientAmount {
    public static long solution(int price, int money, int count) {
        long answer = 0;
        long money2 = money;
        while (count >= 0) {
            money2 -= count * price;
            count--;
        }
        if (money2 < 0) answer = Math.abs(money2);
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(3, 20, 4));
    }
}
