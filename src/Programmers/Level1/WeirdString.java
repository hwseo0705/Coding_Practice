package Programmers.Level1;

public class WeirdString {
    public static String solution(String s) {
        String answer = "";
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                index = 0;
                answer += ' ';
                continue;
            }
            if (index++ % 2 == 0) answer += String.valueOf(s.charAt(i)).toUpperCase();
            else answer += String.valueOf(s.charAt(i)).toLowerCase();
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("tr hello world"));
    }
}
