package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*

       |                 |
       0   1   2   3     4  5   6   7
    [ 24, 32, 42, 60 ] [ 5, 15, 45, 90 ]

    [  5 ]

    - 병합 과정에서 뒤쪽 배열의 값이 작은경우 5의 값이 4번인덱스에서 0번으로 이동하므로
      버블정렬에서 4번 스왑이 일어났다고 볼 수 있음

                             |  |
       0   1   2   3     4   5  6   7
    [ 24, 32, 42, 60 ] [ 5, 15, 45, 90 ]

    [  5, 15, 24, 32  , 42, 45 ]

    - 병합 과정에서 뒤쪽 배열의 값이 작은경우 45의 값이 6번인덱스에서 5번으로 이동하므로
      버블정렬에서 1번 스왑이 일어났다고 볼 수 있음

 */

public class BaekJoon_1517 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        br.readLine();

        int[] A = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        br.close();

        sort(A);
        System.out.println(count);
    }

    // 병합 작업에 쓰일 임시 배열
    private static int[] temp;
    private static long count;

    // 병합 정렬 알고리즘
    private static void mergeSort(int[] arr, int s, int e) {

        // 분할한 배열의 원소가 1개 이하면 return
        if (e - s < 1) return; // 재귀함수 종료 조건

        // 분할의 중앙점을 찾아야 함
        int m = (s + e) / 2;

        // 분할 작업
        mergeSort(arr, s, m);
        mergeSort(arr, m + 1, e);

        // 병합 작업

        // 부분 배열을 임시 배열에 저장
        for (int i = s; i <= e; i++) {
            temp[i] = arr[i];
        }

        // 포인터 2개 선언
        int p1 = s;
        int p2 = m + 1;

        // 포인터끼리 비교한 후 원본배열에 넣어야 할 위치를 지정
        int insertSpot = s;

        // 병합 루프
        while (p1 <= m && p2 <= e) {
            if (temp[p1] < temp[p2]) {
                arr[insertSpot++] = temp[p1++];
            } else {
                count += (p2 - insertSpot);
                arr[insertSpot++] = temp[p2++];
            }
        }

        while (p1 <= m) {
            arr[insertSpot++] = temp[p1++];
        }
        while (p2 <= e) {
            arr[insertSpot++] = temp[p2++];
        }

    }

    public static void sort(int[] arr) {
        temp = new int[arr.length];
        mergeSort(arr, 0, arr.length - 1);
    }


}

//public class BaekJoon_1517 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int N = Integer.parseInt(br.readLine());
//        br.readLine();
//
//        int[] A = new int[N];
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        for (int i = 0; i < N; i++) {
//            A[i] = Integer.parseInt(st.nextToken());
//        }
//        br.close();
//
//        int count = 0;
//        for (int i = A.length - 1; i > 0; i--) {
//            for (int j = 0; j < i; j++) {
//                if (A[j] > A[j + 1]) {
//                    int temp = A[j];
//                    A[j] = A[j + 1];
//                    A[j + 1] = temp;
//                    count++;
//                }
//            }
//        }
//        System.out.println(count);
//    }
//}
