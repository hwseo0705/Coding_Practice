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
