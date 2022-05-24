package F_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class repeatChars {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());
        br.skip(1L);

        for (int i = 0; i < count; i++) {
            String[] token = br.readLine().split(" ");
            int repeat = Integer.parseInt(token[0]);
            String S = token[1];
            String newS = "";
            for (int k = 0; k < S.length(); k++) {
                for (int j = 0; j < repeat; j++) {
                    newS += S.charAt(k);
                }
            }
            System.out.println(newS);
        }

        br.close();

    }
}
