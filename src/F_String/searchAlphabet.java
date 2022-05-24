package F_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class searchAlphabet {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine().toLowerCase();
        br.close();

        int[] alphabets = new int[26];
        Arrays.fill(alphabets, 0, alphabets.length, -1);

        for (int i = 0; i < S.length(); i++) {
            int index = S.charAt(i) - 97;
            if (alphabets[index] == -1) {
                alphabets[index] = i;
            }
        }

        String result = "";
        for (int i = 0; i < alphabets.length; i++) {
            result += (alphabets[i] + " ");
        }
        System.out.println(result);
    }
}
