package InternalContest;

import java.util.Scanner;

public class SumAndXOR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            int c = 0;
            while (n > 0) {
                if ((n & 1) == 0) {
                    c++;
                }
                n >>= 1;
            }
            long r = (1L << c) - 1;
            System.out.println(r);
        }
        sc.close();
    }
}
