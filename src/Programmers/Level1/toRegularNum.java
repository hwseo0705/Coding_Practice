package Programmers.Level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class toRegularNum {
    public static int solution(String s) {
        int answer = 0;
        String integer = "";
        String check = "";

        ArrayList<String> words = new ArrayList<>();
        List<String> wordList = Arrays.asList("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine");
        words.addAll(wordList);

        for (int i = 0; i < s.length(); i++) {
            check += s.charAt(i);
            if (Character.isDigit(s.charAt(i))) {
                integer += check;
                check = "";
            } else if (words.contains(check)) {
                integer += words.indexOf(check);
                check = "";
            }
        }
        answer = Integer.parseInt(integer);
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("123"));
    }
}
