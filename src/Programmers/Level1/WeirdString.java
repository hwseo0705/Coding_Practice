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

// Instructor's Answer
//package codingtest.programmers.level1;
//
///*
//      123   12345   12345  -> count
//      try   hello   world
//      ^ ^   ^ ^ ^   ^ ^ ^  -> count가 홀수인경우 대문자변환
//
//      변환완료된 단일문자들을 하나로합쳐서 문자열로 구성
//
//      - 의사 코드
//      각단어의 위치를 기억할 count변수를 선언 초기값 0;
//      완성 문자열을 저장할 변수;
//      for (문자열의 길이만큼 반복) {
//          한글자씩 뽑아내서 공백인 경우 count를 0으로 만들고
//          공백이 아닌경우 count를 1씩 증가시키면서
//          홀수카운트일경우 대문자 변환을 하고 짝수카운트일경우 소문자변환을 한다.
//          지속적으로 변환한 문자를 하나의 문자열로 합친다.
//      }
//      완성 문자열을 반환;
// */
//public class 이상한_문자_만들기 {
//
//    public static String solution(String s) {
//        String answer = "";
//        return answer;
//    }
//}
