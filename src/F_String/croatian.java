package F_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class croatian {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        // c d l n s z

        String check = "";
        int count = 0;
        int index = 0;
        while (index < word.length()) {
            check += word.charAt(index);
            if (check.length() <= 1) continue;
            switch (check) {
                case "dz=":
                    count += 1;
                    index += 3;
                    check = "";
                    break;
                case "c=":
                case "c-":
                case "d-":
                case "lj":
                case "nj":
                case "s=":
                case "z=":
                    count += 1;
                    index += 2;
                    check = "";
                    break;

            }
        }

    }
}