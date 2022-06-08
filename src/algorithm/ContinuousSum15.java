package algorithm;

import java.util.Scanner;

public class ContinuousSum15 { // two pointer algorithm 01
    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = i + 1;
        }

        int start = 0, end = 0; // start-pointer, end-pointer
        int M = arr[start]; // 부분합을 저장
        int count = 0; // M이 N이 되는 경우의 수

        while (end < N) {
            System.out.printf("start: %d, end: %d, M: %d, count: %d\n", start, end, M, count);
            if (M == N) {
                count++; // 원하는 합 발견 -> count 증가
                end++;
                if (end < N) M += arr[end];
            } else if (M > N) {
                M -= arr[start];
                start++;
            } else {
                end++;
                M += arr[end];
            }
        } // end while

        System.out.println(count);
    }
}
