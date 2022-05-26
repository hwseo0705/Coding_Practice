package G_BasicMathOne;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BreakEvenPoint {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int fixed = Integer.parseInt(input[0]);
        int per = Integer.parseInt(input[1]);
        int price = Integer.parseInt(input[2]);

        if ((price - per) <= 0) System.out.println(-1);
        else {
            int breakEven = fixed / (price - per) + 1;
            System.out.println(breakEven);
        }
    }
}
