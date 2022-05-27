package Baekjoon.F_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ASCII {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int toASCII = br.readLine().charAt(0);
        System.out.println(toASCII);
        br.close();
    }
}
