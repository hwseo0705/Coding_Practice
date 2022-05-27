package Baekjoon.F_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class GroupWordChecker {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        int groupCount = 0;
        br.readLine();
        for (int i = 0; i < count; i++) {
            String word = br.readLine();
//            System.out.println(word);
            ArrayList<Character> wordList = new ArrayList<>();
            for (int j = 0; j < word.length() - 1; j++) {
                if (wordList.contains(word.charAt(j + 1))) {
                    groupCount--;
                    break;
                }
                if (word.charAt(j) == word.charAt(j + 1)) {
                    continue;
                } else {
                    wordList.add(word.charAt(j));
                }
            }
            groupCount++;
        }
        System.out.println(groupCount);
        br.close();
    }
}
