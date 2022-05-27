package Baekjoon.F_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class reverseNum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nums = br.readLine().split(" ");
        br.close();

        String first = "";
        String second = "";
        for (int i = 2; i >= 0; i--) {
            first += nums[0].charAt(i);
            second += nums[1].charAt(i);
        }
        if (Integer.parseInt(first) > Integer.parseInt(second)) {
            System.out.println(first);
        } else {
            System.out.println(second);
        }
    }
}
