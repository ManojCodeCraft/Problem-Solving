package InternalContest;

import java.util.Scanner;

public class NumberOfDivisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            System.out.println(count(n));
        }
        sc.close();
    }

    static int count(long n) {
        int count = 0;
        for (long i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (n / i == i) {
                    count += 1;
                } else {
                    count += 2;
                }
            }
        }
        return count;
    }
}
