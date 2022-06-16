package Programmers.Level1;

import java.util.*;

public class Lotto {
    public static int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];

        // lotto numbers in list
        List<Integer> lottoList = new ArrayList<>();
        for (int i = 0; i < lottos.length; i++) {
            lottoList.add(lottos[i]);
        }
        // win numbers in list
        List<Integer> winList = new ArrayList<>();
        for (int i = 0; i < win_nums.length; i++) {
            winList.add(win_nums[i]);
        }

        int countMatch = 0;
        int countZero = 0;
        for (int lotto : lottoList) {
            if (lotto == 0) countZero++;
            if (winList.contains(lotto)) countMatch++;
        }

        if (countMatch == 0 && countZero == 0) {
            answer[0] = 6;
            answer[1] = 6;
        } else {
            answer[0] = 6 - (countMatch + countZero) + 1;
            answer[1] = 6 - countMatch + 1 > 6 ? 6 : 6 - countMatch + 1;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{44, 1, 0, 0, 31, 25}, new int[]{31, 10, 45, 1, 6, 19})));
    }
}
