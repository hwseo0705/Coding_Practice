package Baekjoon.F_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class countWord {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] words = br.readLine().trim().split(" ");
        if (words.length == 1 && words[0].equals("")) {
            System.out.println(0);
        }else
            System.out.println(words.length);
        br.close();
    }
}
