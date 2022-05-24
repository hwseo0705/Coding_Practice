package F_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class countAlphabet {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine().toUpperCase();
        ArrayList<Character> C = new ArrayList<>();
        int[] count = new int[word.length()];

        for (int i = 0; i < word.length(); i++) {
            char currChar = word.charAt(i);
            if (C.contains(currChar) == false) {
                C.add(currChar);
                count[C.indexOf(currChar)] += 1;
            } else {
                count[C.indexOf(currChar)] += 1;
            }
        }

        int max = count[0];
        int index = 0;
        int maxCount = 0;
        for (int j = 1; j < count.length; j++) {
            if (count[j] == 0) continue;
            if (max == count[j]) maxCount++;

            if (max < count[j]) {
                maxCount = 0;
                max = count[j];
                index = j;
            }
        }

        if (maxCount > 0) {
            System.out.println('?');
        } else {
            System.out.println(C.get(index));
        }
    }
}
