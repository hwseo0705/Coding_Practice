package Baekjoon.D_Arrays;

import java.io.*;
import java.util.Arrays;

public class Min_Max {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(br.readLine());
//        br.skip(1L);
        String[] tokens = br.readLine().split(" ");

        int[] list = new int[tokens.length];
        for (int i = 0; i < tokens.length; i++) {
            list[i] = Integer.parseInt(tokens[i]);
        }

        Arrays.sort(list);

        int min = list[0];
        int max = list[list.length - 1];

        System.out.printf("%d %d\n", min, max);

        br.close();

    }

}
