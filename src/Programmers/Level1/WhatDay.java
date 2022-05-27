package Programmers.Level1;

public class WhatDay {
    public static String solution(int a, int b) {
        String answer = "";
        int[] months = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] days = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};

        int sumDays = 0;
        for (int i = 0; i < a-1; i++) {
            sumDays += months[i];
        }
        sumDays += b;

        int daysIndex = sumDays % 7;
        answer = days[daysIndex];

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(5, 24));
    }
}
