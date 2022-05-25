package E_Function;

import java.util.ArrayList;

public class SelfNumber {
    public static void main(String[] args) {
        ArrayList<String> numbers = new ArrayList<>();
        ArrayList<String> numList = new ArrayList<>();
        for (int i = 1; i <= 10000; i++) {
            numbers.add(String.valueOf(i));
            numList.add(String.valueOf(i));
        }

        for (int i = 0; i < numbers.size(); i++) {
            String firstNum = numbers.get(i);
            int notSelf = Integer.parseInt(firstNum);
            for (int j = 0; j < firstNum.length(); j++) {
                notSelf += Integer.parseInt(String.valueOf(firstNum.charAt(j)));
            }
            if (numList.contains(String.valueOf(notSelf))) numList.remove(String.valueOf(notSelf));
        }

        for (String s : numList) {
            System.out.println(s);
        }
    }
}

//package codingtest.chap05;
//
//import java.util.Arrays;
//
//public class Q02 {
//
//    // self-number 생성자 함수 d(n)
//
//    // n -> 91  return 91 + 9 + 1 = 101
//    // n -> 223 return 223 + 2 + 2 + 3 = 230
//    static int d(int n) {
//
//        int selfNum = n;
//        while (n > 0) {
//            selfNum += (n % 10);
//            n /= 10;
//        }
//        return selfNum;
//    }
//
//    public static void main(String[] args) {
//        boolean[] proofs = new boolean[10000];
//
//        for (int i = 1; i <= proofs.length; i++) {
//            int d1 = d(i);
//            if (d1 <= proofs.length) {
//                proofs[d1 - 1] = true;
//            }
//        }
//
//        // 셀프넘버 출력
//        for (int i = 0; i < proofs.length; i++) {
//            if (!proofs[i]) {
//                System.out.println(i + 1);
//            }
//        }
//
//
//    }
//}
