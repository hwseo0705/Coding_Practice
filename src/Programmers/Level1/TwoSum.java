package Programmers.Level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TwoSum {
    public static int[] solution(int[] numbers) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                int sum = numbers[i] + numbers[j];
                if (!list.contains(sum)) list.add(sum);
            }
        }
        Collections.sort(list);
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{5,0,2,7})));
    }
}
