package C_Loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A_Plus_B_Four {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            try {
                String next = br.readLine();
                if (next.isEmpty() || next == null || next.equals("")) {
                    break;
                }
                String[] token = next.split(" ");
                System.out.println(Integer.parseInt(token[0]) + Integer.parseInt(token[1]));
            } catch (NullPointerException e) {
                break;
            }

        }
        br.close();
    }
}

