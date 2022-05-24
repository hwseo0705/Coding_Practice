package E_Function;

public class nSum {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        System.out.println(sum(a));
    }

    static long sum(int[] a) {
        long ans = 0;
        for (int i: a) {
            ans += i;
        }
        return ans;
    }
}
