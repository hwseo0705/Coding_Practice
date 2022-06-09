package algorithm;

import java.util.Arrays;
import java.util.Scanner;

// 백준 1253
public class Good {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] numbers = new int[length];

        for (int i = 0; i < length; i++) {
            numbers[i] = sc.nextInt();
        }
        sc.close();

        Arrays.sort(numbers);

        int count = 0;
        for (int j = 0; j < length; j++) {
            int s = 0, e = length - 1;
            int target = numbers[j];

            while (s < e) {
                int sum = numbers[s] + numbers[e];
//                System.out.println("=============================");
//                System.out.println(sum);
//                System.out.printf("s: %d, e: %d, n[s]: %d, n[e]: %d\n", s, e, numbers[s], numbers[e]);
//                System.out.println(target);
//                System.out.println("=============================");
                if (target == sum) {
                    if (s == j) s++;
                    else if (e == j) e--;
                    else {
                        count++;
                        break;
                    }
                } else if (target < sum) {
                    e--;
                } else {
                    s++;
                }
            }
        }
        System.out.println(count);


    }
}