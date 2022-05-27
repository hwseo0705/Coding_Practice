package Baekjoon.F_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class croatian {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        // c d l n s z
        int count = 0;
        int i;
        for (i = 0; i < word.length() - 1; i++) {

            /*
                ------ Another way to solve this problem ------

                *   check in reverse order
                    -> look for '=', '-', 'j'
                        *   '=', check if i-1 and i-2 is z and d, i-- or i-=2
                        *   '-', i--
                        *   'j', check if i-- is n or l
                        *   otherwise, just count++
            */

            char first = word.charAt(i);
            char second = word.charAt(i + 1);
            if ((first == 'c') && (second == '-' || second == '=')) {
                i++;
            } else if ((first == 'l') && (second == 'j')) {
                i++;
            } else if ((first == 'n') && (second == 'j')) {
                i++;
            } else if ((first == 's') && (second == '=')) {
                i++;
            } else if ((first == 'z') && (second == '=')) {
                if (i-1 >= 0) {
                    if (word.charAt(i - 1) == 'd') {
                        count -= 1;
                    }
                }
                i++;
            } else if ((first == 'd') && (second == '-')) {
                i++;
            }
            count += 1;
        }

        if (i != word.length()) {
            count += 1;
        }
        System.out.println(count);
    }
}