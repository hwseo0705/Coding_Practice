package Programmers;

import java.util.Arrays;

public class H_Index {
    public static int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);
        System.out.println("Citations: " + Arrays.toString(citations));

        // 0 1 3 5 6

        int H = citations.length;
        for (int i = 0; i < citations.length; i++) {
            if (citations[i] < H) H--;
            else answer = H;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{3, 0, 6, 1, 5}));
    }
}