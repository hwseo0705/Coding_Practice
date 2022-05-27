package Baekjoon.F_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class nSum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        br.skip(1L);

        String numbers = br.readLine();
        br.close();

        int total = 0;
        for (int i = 0; i < count; i++) {
            total += Integer.parseInt(String.valueOf(numbers.charAt(i)));
        }
        System.out.println(total);
    }
}
