package F_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class dialPhone {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        br.close();

        int time = 0;
        for (int i = 0; i < word.length(); i++) {
            int ascii = word.charAt(i);
            if (ascii >= 65 && ascii <= 67) time += 3;
            else if (ascii >= 68 && ascii <= 70) time += 4;
            else if (ascii >= 71 && ascii <= 73) time += 5;
            else if (ascii >= 74 && ascii <= 76) time += 6;
            else if (ascii >= 77 && ascii <= 79) time += 7;
            else if (ascii >= 80 && ascii <= 83) time += 8;
            else if (ascii >= 84 && ascii <= 86) time += 9;
            else if (ascii >= 87 && ascii <= 90) time += 10;
        }
        System.out.println(time);
    }
}
