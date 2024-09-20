package InternalContest;

import java.util.Scanner;

public class ConsecutiveSetBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int count = 0;
            int c = 0;
            long n = sc.nextLong();
            while (n > 0) {
                if ((n & 1) == 1) {
                    c++;
                    count = Math.max(count, c);
                } else {
                    c = 0;
                }
                n >>= 1;
            }
            System.out.println(count);
        }
        sc.close();
    }
}
