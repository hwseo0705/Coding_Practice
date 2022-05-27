package Programmers.Level1;

import java.util.ArrayList;
import java.util.Arrays;

public class MissingNum {
    public static int solution(int[] numbers) {
        int answer = 0;

        boolean[] exists = new boolean[10];

        for (int i = 0; i < numbers.length; i++) {
            exists[numbers[i]] = true;
        }
        for (int j = 0; j < exists.length; j++) {
            if (exists[j] == false) answer += j;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{5,8,4,0,6,7,9}));
    }
}
