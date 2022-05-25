package E_Function;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Third {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());
        if (number < 100) {
            System.out.println(number);
            return;
        }

        int count = 99;
        for (int i = 100; i <= number; i++) {
            int first = i / 100;
            int second = (i % 100) / 10;
            int third = i % 10;
//            System.out.printf("%d %d %d\n", first, second, third);
            if ((first - second) == (second - third)) count += 1;
        }
        System.out.println(count);
        br.close();
    }

}
