package BasicMaths;

import java.util.Scanner;

public class UglyNumber {
    public static boolean isUgly(int n) {
        if (n <= 0)
            return false;
        int[] divisors = { 2, 3, 5 };
        for (int divisor : divisors) {
            while (n % divisor == 0) {
                n /= divisor;
            }
        }
        return n == 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 6;
        System.out.println(isUgly(n));
        sc.close();
    }
}
