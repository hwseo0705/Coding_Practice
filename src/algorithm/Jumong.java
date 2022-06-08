package algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class Jumong {
    /*
     * 1. 오름차 정렬 (Arrays.sort(Array))
     * 2. s를 첫위치 e를 끝위치에 둔다
     * 3. 찾는 수보다 합산 수가 작은 경우 s를 오른쪽으로 한칸 이동
     * 4. 찾는 수보다 합산 수가 큰 경우 e를 왼쪽으로 한칸 이동
     * 5. 찾은 수와 합산 수가 같은 경우 count를 증가시키고 s++, e--
     * */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        sc.nextLine();
        int target = sc.nextInt();
        sc.nextLine();
        sc.nextLine();
        String[] arr = sc.nextLine().split(" ");
        int[] numbers = new int[length];
        for (int i = 0; i < length; i++) {
            numbers[i] = Integer.parseInt(arr[i]);
        }
        Arrays.sort(numbers);
        int s = 0, e = length - 1;
        int count = 0;
        while (true) {
            int sum = numbers[s] + numbers[e];
            if (target == sum) {
                count++;
                s++;
                e--;
            } else if (target < sum) {
                e--;
            } else {
                s++;
            }
            if (e < s) break;
        }
        System.out.println(count);
    }
}
