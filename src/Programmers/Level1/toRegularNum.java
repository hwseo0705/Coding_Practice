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

// Instructor's Answer
//package codingtest.programmers.level1;
//
//public class 숫자_문자열과_영단어 {
//
//    public static int solution(String s) {
//        String[] numberStr = {"zero", "one", "two", "three",
//                "four", "five", "six",
//                "seven", "eight", "nine"};
//
//        for (int i = 0; i < numberStr.length; i++) {
//            s = s.replace(numberStr[i], String.valueOf(i));
//        }
//        return Integer.parseInt(s);
//    }
//
//    public static void main(String[] args) {
//
//        /*
//        String s = "one4seveneight";
//        s = s.replace("one", "1");
//        s = s.replace("seven", "7");
//        s = s.replace("eight", "8");
//        System.out.println(s);
//
//         */
//
//        System.out.println(solution("one4seveneight"));
//    }
//}
