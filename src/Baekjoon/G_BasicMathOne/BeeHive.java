package Baekjoon.G_BasicMathOne;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BeeHive {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());
        br.close();

        int total = number;
        int numRoom = 0;

        if (number == 1) {
            System.out.println(1);
            return;
        }

        while (total > 0) {
            total -= 6 * numRoom++;
        }
        System.out.println(numRoom);
    }
}
