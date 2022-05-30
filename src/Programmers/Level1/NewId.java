package Programmers.Level1;

public class NewId {
    public static String solution(String new_id) {
        String answer =  new_id.toLowerCase();
        answer = answer.replaceAll("[^a-zA-Z0-9-_.]", "");
        answer = answer.replaceAll("[.]+", ".");
        if (answer.charAt(0) == '.') answer = answer.substring(1);
        if (answer.length() > 15) answer = answer.substring(0, 15);
        if (answer.length() == 0) answer = "aaa";
        if (answer.charAt(answer.length()-1) == '.') answer = answer.substring(0, answer.length()-1);
        if (answer.length() < 3) {
            char lastChar = answer.charAt(answer.length() - 1);
            while (answer.length() != 3) {
                answer += lastChar;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("...!@BaT#*..y.abcdefghijklm"));
    }
}
